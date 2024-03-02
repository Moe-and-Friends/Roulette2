package moe.best.roulette2.action

import moe.best.roulette2.config.types.Bounds as ConfigBounds

class Timeout(
    private val bounds: ConfigBounds,
) {
    val lowerBoundMinutes = bounds.lowerBoundMinutes
    val upperBoundMinutes = maxOf(bounds.upperBoundMinutes, lowerBoundMinutes)
}
