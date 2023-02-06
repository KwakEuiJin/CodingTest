package programmers_lv1

fun main() {
    println(solution(intArrayOf(5,8,4,0,6,7,9)))
}

private fun solution(numbers: IntArray): Int {
    var answer = 0
    val bArray = Array(10) { false }
    numbers.forEach { i -> bArray[i] = true }
    bArray.forEachIndexed { index, b ->
        if (!b) {
            answer += index
        }
    }
    return answer
}