package beakjoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var answer = 0
    val N = readln().toInt()

    val aArray = readln().split(" ").map { it.toInt() }.toIntArray().sortedArray()
    val bArray = readln().split(" ").map { it.toInt() }.toIntArray().sortedArrayDescending()

    for (i in 0 until N) {
        answer += aArray[i] * bArray[i]
    }

    println(answer)
}


