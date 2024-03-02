package moe.best.roulette2.config.types

data class Role(
    val id: String, // Role IDs will overflow as integers.
    val name: String? = ""
)