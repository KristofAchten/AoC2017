package challenges.day2

import challenges.Puzzle
import kotlin.streams.toList

class D2Checksum : Puzzle() {
    val lists = getInput(2).split("\n")

    override fun part1(): String {
        var sum = 0
        for (list in lists) {
            val listOfVals = list.split("\t")
            sum += listOfVals.stream().mapToInt(Integer::parseInt).max().asInt - listOfVals.stream()
                .mapToInt(Integer::parseInt).min().asInt
        }

        return sum.toString()
    }

    override fun part2(): String {
        var sum = 0
        for (list in lists) {
            val listOfVals = list.split("\t").stream().mapToInt(Integer::parseInt).sorted().toList().reversed()

            for (x in listOfVals.indices) {
                for (y in x + 1 until listOfVals.size) {
                    if (listOfVals[x] % listOfVals[y] == 0) {
                        sum += listOfVals[x] / listOfVals[y]
                    }
                }
            }
        }

        return sum.toString()
    }

}