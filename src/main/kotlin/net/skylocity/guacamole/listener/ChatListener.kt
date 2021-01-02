package net.skylocity.guacamole.listener

import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter
import net.skylocity.guacamole.Guacamole

class ChatListener(private val bot: Guacamole): ListenerAdapter() {
    private var rainbowThread: Thread? = null

    override fun onMessageReceived(event: MessageReceivedEvent) {
        if (event.message.contentRaw == "MENTION") {
            val builder = StringBuilder()

            for (member in event.guild.members) {
                builder.append("HELLO ${member.asMention}\n")
            }

            event.channel.sendMessage(builder.toString()).queue()
        }

        if (event.message.contentRaw == "**silence**") {
            event.channel.sendMessage("did you know that silence isn").queue()
        }

        if (event.message.contentRaw == "are you sad quacbot?") {
            event.channel.sendMessage("yes :cry:").queue()
        }
    }
}