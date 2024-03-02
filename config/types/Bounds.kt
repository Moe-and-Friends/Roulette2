package moe.best.roulette2.config.types

data class Bounds(
    private val lowerBound: String? = null, // Declare a default for Gestalt
    private val upperBound: String? = null, // Declare a default for Gestalt
) {
    val lowerBoundMinutes = lowerBound.toMinutes()
    val upperBoundMinutes = upperBound.toMinutes()

    /**
     * An internal extension function for converting written lengths
     * to an integer representing absolute minutes.
     */
    private fun String?.toMinutes(): Int {
        val modifier = this?.last()?.toString()
        val time = this?.filter { it.isDigit() }?.toInt() ?: 0
        return when {
            modifier.equals("m", true) -> time * MINUTES
            modifier.equals("h", true) -> time * HOURS
            modifier.equals("d", true) -> time * DAYS
            modifier.equals("w", true) -> time * WEEKS
            else -> 0
        }
    }

    /** Constants for converting written interval extensions to minutes. */
    companion object {
        val MINUTES: Int = 1
        val HOURS: Int = MINUTES * 60
        val DAYS: Int = HOURS * 24
        val WEEKS: Int = DAYS * 7
    }
}