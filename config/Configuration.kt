package moe.best.roulette2.config

import org.github.gestalt.config.builder.GestaltBuilder
import org.github.gestalt.config.kotlin.getConfig
import org.github.gestalt.config.reload.TimedConfigReloadStrategy
import org.github.gestalt.config.source.EnvironmentConfigSourceBuilder
import org.github.gestalt.config.source.MapConfigSourceBuilder
import org.github.gestalt.config.source.URLConfigSourceBuilder
import java.time.Duration

class Configuration {

    private val gestalt = GestaltBuilder().apply {
        // Source builders will overload each other for properties.

        // Default source right now is hard-coded for Moe and Friends server
        addSource(
            MapConfigSourceBuilder.builder().apply {
                setCustomConfig(MoeAndFriendsConfiguration.config) 
            }.build()
        )

        // Use URLConfig instead of Git, since the entire repo being stored locally is not needed.
        addSource(
            URLConfigSourceBuilder.builder().apply {
                setSourceURL("https://raw.githubusercontent.com/Moe-and-Friends/Configurations/main/roulette.toml")
                addConfigReloadStrategy(TimedConfigReloadStrategy(Duration.ofMinutes(30)))
            }.build()
        )

        // Last but not least, read any configs set from Environment Variables
        addSource(
            EnvironmentConfigSourceBuilder.builder().apply {
                setFailOnErrors(true)
                setPrefix(ENV_CONFIG_PREFIX)
                setRemovePrefix(true)
            }.build()
        )
    }.build().also { it.loadConfigs() }

    // Example: `export "ROULETTE_DISCORD_API_TOKEN=<token>"
    val discordApiToken: String = gestalt.getConfig("discord.api.token")

    val selfSafeMessages: List<String>
        get() = gestalt.getConfig("mute_messages_self", SELF_SAFE_MESSAGES)

    private companion object Defaults {
        val ENV_CONFIG_PREFIX = "ROULETTE_"
        val SELF_SAFE_MESSAGES = listOf<String>("You have a safe role, so you won't be muted :)")
    }
}
