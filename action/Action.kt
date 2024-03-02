package moe.best.roulette2.action

import moe.best.roulette2.config.types.Action as ConfigAction
import moe.best.roulette2.config.types.Action.Type as ConfigActionType

class Action(
    private val configAction: ConfigAction,
) {

    val weight = configAction.weight

    val timeout: Timeout? = configAction.timeout.let { Timeout(it) }.takeIf { 
        it.lowerBoundMinutes != 0 && it.upperBoundMinutes != 0 
    }

    val type: Type = when (configAction.type) {
        // To be a type TIMEOUT, the actual timeout variable itself must not be null.
        ConfigActionType.TIMEOUT -> { if (this.timeout != null) Type.TIMEOUT else Type.NOTHING }
        else -> Type.NOTHING
    }

    enum class Type {
        TIMEOUT,
        NOTHING,
    }
}
