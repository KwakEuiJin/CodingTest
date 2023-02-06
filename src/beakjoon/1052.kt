package beakjoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val input = readln()
    var count = 0
    var n = input.split(" ").first().toInt()
    val k = input.split(" ").last().toInt()
    var answer = 0
    if (n < k) {
        println(0)
        return@with
    }
    while (true) {
        var c = n
        count = 0
        while (c != 0) {
            if (c % 2 == 1) {
                count++
            }
            c /= 2
        }
        if (count <= k) {
            break
        }
        n++
        answer++
    }
    println(answer)
}