package beakjoon

import kotlin.math.max

fun main() {
    val input = readln()
    val k = input.split(" ").last().toInt()
    val array = "1 1 0 0 1 1 0 1 1 0 1 1 0 1".split(" ").map { it.toInt() }
    var count = 0
    var currentIndex = 0
    var copyK = k

    for (i in array.indices) {
        if (array[i] == 0) {
            copyK--
        }
        while (copyK < 0) {
            if (array[currentIndex] == 0) {
                copyK++
            }
            currentIndex++
        }
        count = max(count, i - currentIndex + 1)
    }
    println(count)
}

