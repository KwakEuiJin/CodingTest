package programmers_lv2

fun main() {
    println(solution("-1 -1"))
}

fun solution(s: String): String {
    val answer = s.split(" ").map { it.toInt() }
    return "${answer.minOf { it }} ${answer.maxOf { it }}"
}