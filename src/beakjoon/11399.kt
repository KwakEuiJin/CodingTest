package beakjoon

fun main() {
    var answer = 0
    var sumTime = 0
    readln().toInt()
    readln().split(" ").map { it.toInt() }.sorted().forEach {
        answer += it + sumTime
        sumTime += it
    }
    println(answer)
}