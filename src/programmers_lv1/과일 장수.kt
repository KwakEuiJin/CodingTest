
fun main(args: Array<String>) {
    val k = 4
    val m = 3
    var score = intArrayOf(4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2)
    println(solution(k, m, score))
}

private fun solution(k: Int, m: Int, score: IntArray): Int {
    var answer = 0
    score.sortedDescending().chunked(m).filter { it.size == m }.map { list: List<Int> ->
        answer += list.minOf { it * m }
    }
    return answer
}

