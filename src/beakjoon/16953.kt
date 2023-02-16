package beakjoon

fun main() {
    val input = readln().split(" ")
    var count = 0
    val a = input.first().toInt()
    var b = input.last().toInt()

    while (a != b) {
        if (a > b) {
            break
        }

        if (b % 10 == 1) {
            b /= 10
            count++
        } else if (b % 2 == 0) {
            b /= 2
            count++
        } else {
            break
        }
    }

    if (a == b) {
        println(count + 1)
    } else {
        println(-1)
    }
}