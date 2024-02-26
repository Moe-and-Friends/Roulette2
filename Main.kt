@file:JvmName("Main")

package moe.best.roulette2

import moe.best.roulette2.config.Configuration

fun main() {
    println(Configuration().selfSafeMessages.joinToString("\n"))
}