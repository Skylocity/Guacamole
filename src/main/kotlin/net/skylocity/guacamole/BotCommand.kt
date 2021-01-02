package net.skylocity.guacamole

interface BotCommand {

    fun run(args: Array<String>): Boolean
}