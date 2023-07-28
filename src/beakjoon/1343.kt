package beakjoon

fun main() {
    val input = readln().replace("XXXX", "AAAA").replace("XX", "BB")
    println(if ('X' in input) -1 else input)
}