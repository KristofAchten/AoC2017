import challenges.Puzzle
import challenges.day1.D1Calculator
import challenges.day2.D2Checksum

private val puzzles = mutableListOf<Puzzle>(
    D1Calculator(),
    D2Checksum()
)

fun main() {
    for (p in puzzles) {
        p.solve();
    }
}