package challenges.day1

import challenges.Puzzle

class D1Calculator : Puzzle() {
    val input = getInput(1)

    override fun part1() : String = sumOfMatchingNumbersAtDistance(1).toString()

    override fun part2() : String = sumOfMatchingNumbersAtDistance(input.length / 2).toString()

    fun sumOfMatchingNumbersAtDistance(distance : Int) : Int {
        var sum = 0
        for (i in input.indices) {
            if (input[i] == input[(i + distance) % input.length]) {
                sum += input[i].toString().toInt()
            }
        }

        return sum
    }
}