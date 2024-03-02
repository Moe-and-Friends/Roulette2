package moe.best.roulette2.config.types

data class Action(
    val type: Type = Type.UNKNOWN,
    val weight: Int = 0,
    val timeout: Bounds = Bounds() // Declare a default for Gestalt
) {

    enum class Type {
        TIMEOUT,
        UNKNOWN
    }
}