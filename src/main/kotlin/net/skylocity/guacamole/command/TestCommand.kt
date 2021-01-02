package net.skylocity.guacamole.command

import net.skylocity.guacamole.BotCommand

class TestCommand: BotCommand {

    override fun run(args: Array<String>): Boolean {
        return true
    }
}