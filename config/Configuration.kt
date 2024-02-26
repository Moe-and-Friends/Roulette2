package moe.best.roulette2.config

import java.time.Duration
import org.github.gestalt.config.builder.GestaltBuilder
import org.github.gestalt.config.kotlin.getConfig
import org.github.gestalt.config.reload.TimedConfigReloadStrategy
import org.github.gestalt.config.source.URLConfigSourceBuilder

class Configuration {

    private val gestalt = GestaltBuilder().apply {
        // Source builders will overload each other for properties.
    
        // Use URLConfig instead of Git, since the entire repo being stored locally is not needed.
        addSource(URLConfigSourceBuilder.builder().apply {
            setSourceURL("https://raw.githubusercontent.com/Moe-and-Friends/Configurations/main/roulette.toml")
            addConfigReloadStrategy(TimedConfigReloadStrategy(Duration.ofMinutes(30)))
        }.build())
    
    }.build().also { it.loadConfigs() }

    val selfSafeMessages: List<String>
        get() = gestalt.getConfig("mute_messages_self", SELF_SAFE_MESSAGES)

    private companion object Defaults {
        val SELF_SAFE_MESSAGES = listOf<String>("You have a safe role, so you won't be muted :)")
    }

}