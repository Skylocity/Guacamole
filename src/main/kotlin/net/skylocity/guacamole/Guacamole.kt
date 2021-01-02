package net.skylocity.guacamole

import net.dv8tion.jda.api.JDA
import net.dv8tion.jda.api.JDABuilder
import net.skylocity.guacamole.listener.ChatListener

class Guacamole(private val token: String) {
    private var jda: JDA? = null

    fun init() {
        val builder = JDABuilder.createDefault(token)

        builder.addEventListeners(ChatListener(this))

        jda = builder.build()
    }

    fun getJDA(): JDA? {
        return this.jda
    }
}