package net.skylocity.guacamole

import kotlin.system.exitProcess

object Main {

    @JvmStatic fun main(args: Array<String>) {
        if (args.isEmpty()) {
            println("No token was found.")
            exitProcess(0)
        }
        Guacamole(args[0]).init()
    }
}