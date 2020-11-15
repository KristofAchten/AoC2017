import challenges.Puzzle
import challenges.day1.D1Calculator

private val puzzles = mutableListOf<Puzzle>(
    D1Calculator()
)

fun main() {
    for (p in puzzles) {
        p.solve();
    }
}