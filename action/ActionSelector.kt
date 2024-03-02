package moe.best.roulette2.action

import kotlin.random.Random
import moe.best.roulette2.config.types.Action as ConfigAction

object ActionSelector {

    fun select(configActions: List<ConfigAction>): Action? {
        // Convert all config-provided actions into Actions, which will normalise values.
        val actions = configActions.map { Action(it) }.filterNot { it.type == Action.Type.NOTHING }

        // The total weight of all valid actions is used for probability determination.
        val totalWeight = actions.map { it.weight }.sum()

        // Select an action and return it.
        var actionIndex = Random.nextInt(from = 0, until = totalWeight)
        for (action in actions) {
            if ((actionIndex - action.weight) <= 0) {
                return action
            }
            actionIndex -= action.weight
        }

        return null
    }
}
