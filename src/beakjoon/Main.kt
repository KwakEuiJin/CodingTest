package beakjoon

fun main() {
    val n = readln().toInt()
    for (i in 0 until n) {
        val input = readln()
        println("${input.first()}${input.last()}")
    }
}