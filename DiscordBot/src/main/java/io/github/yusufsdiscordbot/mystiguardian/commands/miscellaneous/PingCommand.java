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
package io.github.yusufsdiscordbot.mystiguardian.commands.miscellaneous;

import io.github.yusufsdiscordbot.mystiguardian.event.bus.SlashEventBus;
import io.github.yusufsdiscordbot.mystiguardian.slash.ISlashCommand;
import io.github.yusufsdiscordbot.mystiguardian.utils.MystiGuardianUtils;
import io.github.yusufsdiscordbot.mystiguardian.utils.PermChecker;
import java.time.Instant;
import lombok.val;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import org.jetbrains.annotations.NotNull;

@SlashEventBus
public class PingCommand implements ISlashCommand {

    @Override
    public void onSlashCommandInteractionEvent(
            @NotNull SlashCommandInteractionEvent event,
            MystiGuardianUtils.ReplyUtils replyUtils,
            PermChecker permChecker) {
        var unFormattedGatewayLatency = event.getJDA().getGatewayPing();
        var unFormattedRestLatency = event.getJDA().getRestPing().complete();
        val now = Instant.now();

        val gatewayLatency = MystiGuardianUtils.formatString("%dms", unFormattedGatewayLatency);
        val restLatency = MystiGuardianUtils.formatString("%dms", unFormattedRestLatency);

        val embedBuilder = new EmbedBuilder();
        embedBuilder.setTitle("Pong!");
        embedBuilder.addField("Gateway latency", gatewayLatency, true);
        embedBuilder.addField("REST latency", restLatency, true);
        embedBuilder.setFooter(
                MystiGuardianUtils.formatString("Requested by %s", event.getUser().getName()),
                event.getUser().getAvatar().getUrl());
        embedBuilder.setColor(MystiGuardianUtils.getBotColor());

        replyUtils.sendEmbed(embedBuilder);
    }

    @NotNull
    @Override
    public String getName() {
        return "ping";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Get the bots websocket and REST latency";
    }
}
