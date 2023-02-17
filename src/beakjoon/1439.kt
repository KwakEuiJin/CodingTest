package beakjoon

import kotlin.math.min

fun main() {
    val input = readln()
    val a = input.split("0").filter { it.isNotEmpty() }.size
    val b = input.split("1").filter { it.isNotEmpty() }.size
    println(min(a,b))
}