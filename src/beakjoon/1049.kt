package beakjoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val answer: Int
    val list = readln().split(" ")
    val packageList = arrayListOf<Int>()
    val oneList = arrayListOf<Int>()
    val n = list.first().toInt()
    val m = list.last().toInt()
    for (i in 0 until m) {
        val inputList = readln().split(" ")
        val first = inputList.first().toInt()
        val second = inputList.last().toInt()
        packageList.add(first)
        oneList.add(second)
    }

    val tmp = if ((n % 6) != 0) { (n / 6) + 1 } else { n / 6 }
    val one = oneList.minOf { it }
    val all = packageList.minOf { it }
    answer = if (n * one > tmp * all) {
        tmp * packageList.minOf { it }
    } else if (all > 6 * one) {
        n * one
    } else {
        (n/6) * all + (n % 6) * one
    }

    println(answer)
}
