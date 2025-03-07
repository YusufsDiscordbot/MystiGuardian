/*
 * Copyright 2024 RealYusufIsmail.
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
 */ 
package io.github.yusufsdiscordbot.mystiguardian.oauth;

import io.github.yusufsdiscordbot.mystiguardian.oauth.http.DiscordRestAPI;
import io.github.yusufsdiscordbot.mystiguardian.oauth.requests.MainRequestsHandler;
import io.github.yusufsdiscordbot.mystiguardian.oauth.utils.JWTUtils;
import io.github.yusufsdiscordbot.mystiguardian.oauth.utils.PortUtils;
import io.github.yusufsdiscordbot.mystiguardian.utils.MystiGuardianUtils;
import java.io.IOException;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import spark.Spark;

@Slf4j
public class OAuth {

    @Getter private static JWTUtils authUtils;

    @Getter private static String clientId;

    @Getter private static String clientSecret;

    @Getter private static DiscordRestAPI discordRestAPI;

    public static void runOAuth() throws IOException {
        authUtils = new JWTUtils();

        clientId = MystiGuardianUtils.getDiscordAuthConfig().clientId();
        clientSecret = MystiGuardianUtils.getDiscordAuthConfig().clientSecret();

        discordRestAPI = new DiscordRestAPI(clientId, clientSecret);

        int port = PortUtils.findOpenPort(25590, 25600);
        Spark.port(port);

        try {
            new MainRequestsHandler();
        } catch (Exception e) {
            logger.error("Failed to register requests", e);
        }
    }
}
