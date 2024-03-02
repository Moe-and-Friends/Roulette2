package moe.best.roulette2.config

import moe.best.roulette2.config.types.Action
import moe.best.roulette2.config.types.Role
import java.time.Duration

interface Configuration {

    /** Discord Bot API token. */
    val discordApiToken: String

    /** Roles that can execute superuser commands. */
    val adminRoles: List<Role>

    /** Roles that are exempt from any action effect. */
    val safeRoles: List<Role>

    /** Messages that are used to respond to safe roles. */
    val selfSafeMessages: List<String>

    /** A list of [Action]s that represent possible roll outcomes. */
    val actions: List<Action>
}
