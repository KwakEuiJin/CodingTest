package beakjoon

fun main() {
    var first = 0
    var plus = 0
    var minus = 0
    readln().split("-").forEachIndexed { index, s ->
        if (index == 0) {
            first += s.split("+").sumOf { it.toInt() }
        } else {
            if (s.contains("+")) {
                plus += s.split("+").sumOf { it.toInt() }
            } else {
                minus += s.toInt()
            }
        }
    }
    println(-minus - plus + first)
}