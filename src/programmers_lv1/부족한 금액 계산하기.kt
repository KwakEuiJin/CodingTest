package programmers_lv1

fun main() {
    println(solution(3, 20, 4))
}

private fun solution(price: Int, money: Int, count: Int): Long {
    val sum = Array(count) { ((it + 1) * price).toLong() }.sum()
    return if (sum <= money) {
        0
    } else {
        sum - money.toLong()
    }
}