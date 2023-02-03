package programmers_lv1

import java.lang.StringBuilder

fun main() {
    println(solution("zzz", "abcde", 5))
}

private fun solution(s: String, skip: String, index: Int): String {
    val answer = StringBuilder("")
    val sArray = s.toCharArray()
    sArray.forEachIndexed { indexs, c ->
        for (i in 0 until index) {
            do {
                sArray[indexs]++
                if (sArray[indexs] > 'z') {
                    sArray[indexs] = sArray[indexs] - 26
                }
            } while (skip.contains(sArray[indexs]))
        }
    }
    answer.append(sArray)
    return answer.toString()
}