import challenges.Puzzle
import challenges.day1.D1Calculator
import challenges.day2.D2Checksum
import challenges.day3.D3Spiral

private val puzzles = mutableListOf<Puzzle>(
    D1Calculator(),
    D2Checksum(),
    D3Spiral()
)

fun main() {
    for (p in puzzles) {
        p.solve();
    }
}