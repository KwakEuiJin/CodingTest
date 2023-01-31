package programmers_lv1

fun main() {
    println(solution(12))
}

private fun solution(n: Int): Int {
    var answer: Int = 0
    for (i in 2 until n) {
        if (n%i == 1) {
            answer = i
            break
        }
    }
    return answer
}

