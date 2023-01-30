package programmers_lv1

import java.lang.StringBuilder

fun main() {
    println(solution(arrayOf("AN", "CF", "MJ", "RT", "NA"), intArrayOf(5, 3, 2, 7, 5)))
}

private fun solution(survey: Array<String>, choices: IntArray): String {
    var answer = StringBuilder("")
    val surveyList = listOf('R', 'T', 'C', 'F', 'J', 'M', 'A', 'N')
    val surveyResultList = mutableListOf(0, 0, 0, 0, 0, 0, 0, 0)

    survey.forEachIndexed { index, k ->
        if (choices[index] > 4) {
            surveyResultList[surveyList.indexOf(k[1])] += choices[index] -4
        } else if (choices[index] < 4) {
            val cost = when(choices[index]) {
                1 -> 3
                2-> 2
                else -> 1
            }
            surveyResultList[surveyList.indexOf(k[0])] += cost
        }
    }

    for (i in 0..3) {
        if (surveyResultList[i * 2] > surveyResultList[(i * 2) + 1]) {
            answer.append(surveyList[i * 2])
        } else if (surveyResultList[i * 2] < surveyResultList[(i * 2) + 1]) {
            answer.append(surveyList[(i * 2) + 1])
        } else {
            answer.append(minOf(surveyList[i * 2], surveyList[(i * 2) + 1]))
        }
    }
    return answer.toString()
}