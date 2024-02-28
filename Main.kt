@file:JvmName("Main")

package moe.best.roulette2

import kotlinx.coroutines.runBlocking
import moe.best.roulette2.config.Configuration
import org.javacord.api.DiscordApi
import org.javacord.api.DiscordApiBuilder
import org.javacord.api.entity.intent.Intent

fun main() = runBlocking {
    val config = Configuration()

    val discordApi: DiscordApi = DiscordApiBuilder().apply {
        setToken(config.discordApiToken)
        addIntents(
            Intent.MESSAGE_CONTENT,
            Intent.GUILD_MESSAGES,
            Intent.GUILD_MESSAGE_REACTIONS,
        )
    }.login().join()
}
