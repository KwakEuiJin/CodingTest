package beakjoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val conferenceTimeArray = mutableListOf<Pair<Int, Int>>()
    var answer = 0
    val N = readln().toInt()
    for (i in 0 until N) {
        val input = readln()
        val inputList = input.split(" ")
        conferenceTimeArray.add(Pair(inputList[0].toInt(), inputList[1].toInt()))
    }
    var endTime = 0

    conferenceTimeArray.sortWith(compareBy<Pair<Int, Int>> { it.second }.thenBy { it.first })

    conferenceTimeArray.forEachIndexed { _, pair ->
        if (endTime <= pair.first) {
            endTime = pair.second
            answer++
        }
    }

    println(answer)

}

