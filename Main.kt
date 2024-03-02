@file:JvmName("Main")

package moe.best.roulette2

import kotlinx.coroutines.runBlocking
import moe.best.roulette2.action.ActionSelector
import moe.best.roulette2.config.Configuration
import moe.best.roulette2.config.GestaltConfigurationImpl
import org.javacord.api.DiscordApi
import org.javacord.api.DiscordApiBuilder
import org.javacord.api.entity.intent.Intent

// For JVM compatability, the return type needs to be left as "Void".
fun main() {
    runBlocking {
        val config = GestaltConfigurationImpl() as Configuration

        println(ActionSelector.select(config.actions)?.type.toString())
    //val discordApi: DiscordApi = DiscordApiBuilder().apply {
    //    setToken(config.discordApiToken)
    //    addIntents(
    //        Intent.MESSAGE_CONTENT,
    //        Intent.GUILD_MESSAGES,
    //        Intent.GUILD_MESSAGE_REACTIONS,
    //    )
    //}.login().join()
    }
}
