import io.github.realyusufismail.jconfig.JConfig
import nu.studer.gradle.jooq.JooqEdition
import org.jooq.meta.jaxb.ForcedType
import org.jooq.meta.jaxb.Logging

buildscript {
    repositories { mavenCentral() }
    dependencies {
        classpath("org.postgresql:postgresql:42.6.0")
        classpath("io.github.realyusufismail:jconfig:1.0.9")
    }
}

plugins {
    id("java")
    id("com.diffplug.spotless") version "6.22.0"
    id("nu.studer.jooq") version "8.1"
}

group = "io.github.yusufsdiscordbot"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.javacord:javacord:3.8.0")
    implementation("io.github.realyusufismail:jconfig:1.0.9")
    implementation("io.github.classgraph:classgraph:4.8.161")
    implementation("ch.qos.logback:logback-classic:1.4.7")
    implementation("ch.qos.logback:logback-core:1.4.7")
    implementation("uk.org.lidalia:sysout-over-slf4j:1.0.2")
    compileOnly("org.projectlombok:lombok:1.18.30")
    annotationProcessor("org.projectlombok:lombok:1.18.30")
    implementation("org.jooq:jooq:3.18.7")
    implementation("org.jooq:jooq-meta:3.18.7")
    implementation("org.jooq:jooq-codegen:3.18.7")
    implementation("org.postgresql:postgresql:42.6.0")
    jooqGenerator("org.postgresql:postgresql:42.6.0")
    implementation("com.zaxxer:HikariCP:5.0.1")
    implementation("com.google.guava:guava:31.1-jre")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
}

configurations {
    all { exclude(group = "org.slf4j", module = "slf4j-log4j12") }
    compileOnly { extendsFrom(configurations.annotationProcessor.get()) }
}

tasks.test {
    useJUnitPlatform()
    jvmArgs("--enable-preview")
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21

    withSourcesJar()
    withJavadocJar()
}

tasks.withType<JavaCompile> {
    options.compilerArgs.add("--enable-preview")
}

tasks.withType<JavaExec> {
    jvmArgs("--enable-preview")
}


spotless {
    kotlinGradle {
        target("**/*.gradle.kts")
        ktfmt("0.42").dropboxStyle()
        trimTrailingWhitespace()
        indentWithSpaces()
        endWithNewline()
    }

    java {
        target("**/*.java")
        googleJavaFormat()
        trimTrailingWhitespace()
        indentWithSpaces()
        endWithNewline()
        licenseHeader(
            """/*
 * Copyright 2023 RealYusufIsmail.
 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */ """)
    }
}

jooq {
    version.set("3.18.7")
    edition.set(JooqEdition.OSS)
    configurations {
        create("jooqGenerator") {
            generateSchemaSourceOnCompilation.set(false)
            jooqConfiguration.apply {
                logging = Logging.WARN
                jdbc.apply {
                    driver = "org.postgresql.Driver"
                    url = getSecrete("database.url") ?: ""
                    user = getSecrete("database.user") ?: ""
                    password = getSecrete("database.password") ?: ""
                }

                generator.apply {
                    name = "org.jooq.codegen.DefaultGenerator"
                    database.apply {
                        name = "org.jooq.meta.postgres.PostgresDatabase"
                        inputSchema = "public"
                        includes = ".*"
                        excludes = ""
                        forcedTypes.addAll(
                            listOf(
                                ForcedType().apply {
                                    name = "varchar"
                                    includeExpression = ".*"
                                    includeTypes = "JSONB?"
                                },
                                ForcedType().apply {
                                    name = "INSTANT"
                                    includeExpression = ".*"
                                    includeTypes = "TIMESTAMP"
                                }))
                    }
                    generate.apply {
                        isDeprecated = false
                        isRecords = true
                        isImmutablePojos = true
                        isFluentSetters = true
                    }
                    target.apply {
                        packageName = "io.github.yusufsdiscordbot.mystigurdian.db"
                        directory = "src/main/java"
                    }
                    strategy.name = "org.jooq.codegen.DefaultGeneratorStrategy"
                }
            }
        }
    }
}

fun getSecrete(key: String): String? {
    return if (System.getenv().containsKey(key)) {
        System.getenv(key)
    } else if (System.getProperties().containsKey(key)) {
        System.getProperty(key)
    } // check if config.json exists
    else if (File("config.json").exists()) {
        val config: JConfig = JConfig.build()
        if (config.contains(key)) {
            config[key]?.asString
        } else {
            null
        }
    } else {
        null
    }
}