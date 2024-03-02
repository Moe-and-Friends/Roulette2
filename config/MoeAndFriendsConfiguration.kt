package moe.best.roulette2.config

/**
 * A hard-coded default configuration for the Moe and Friends Discord Guild.
 * TODO: Move/rename this file.
 */
object MoeAndFriendsConfiguration {
    val config = mapOf(
        "roles.admin[0].id" to "644057450743595010",
        "roles.admin[0].name" to "Sheriff",
        "roles.admin[1].id" to "986229557659045899",
        "roles.admin[1].name" to "Deputy",
        
        "roles.safe[0].id" to "546422996810727434",
        "roles.safe[0].name" to "Best Friends",
        "roles.safe[1].id" to "1061611797133668423",
        "roles.safe[1].name" to "Ice Guy",
        "roles.safe[2].id" to "1157317681159098448",
        "roles.safe[2].name" to "Rakka",

        "roles.mute.id" to "672306562072576023",
        "roles.mute.name" to "Timeout",

        "triggers[0].match" to "<:gamerwhen:651367432967159808>",
        "triggers[0].name" to "\"Gamer When\" Emoji",
    )


    val actionsConfig = mapOf(
        "actions[0].type" to "TIMEOUT",
        "actions[0].weight" to "5",
        "actions[0].timeout.lowerBound" to "1m",
        "actions[0].timeout.upperBound" to "5m",

        "actions[1].type" to "UNKNOWN",
        "actions[1].weight" to "5",

        "actions[2].type" to "TIMEOUT",
        "actions[2].weight" to "5",
        "actions[2].timeout.lowerBound" to "1m",
    )
}