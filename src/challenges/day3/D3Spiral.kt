package challenges.day3

import challenges.Puzzle
import kotlin.math.max

class D3Spiral : Puzzle() {
    val input = getInput(3).toInt()
    
    override fun part1(): String {
        var width = 1
        var maxval = 1
        var layer = 0
        
        while (maxval < input) {
            layer++
            width += 2
            maxval += width * 2 + 2 * (width - 2)
        }

        val modDiff = Math.ceil((maxval.toDouble() - (maxval - (width * 2 + 2 * (width - 2)) + 1)) / 4).toInt()
        val offset = (modDiff / 2) - ((maxval - input) % modDiff)
        val result = Math.abs(offset) + layer

        return result.toString()
    }

    override fun part2(): String {
        return "todo"
    }

}