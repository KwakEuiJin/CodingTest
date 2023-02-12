package programmers_lv1

import java.time.LocalDate
import java.time.format.DateTimeFormatter


fun main() {
    println(
        solution(
            "2022.02.28",
            arrayOf("A 23"),
            arrayOf("2020.01.28 A")
        )
    )
}

private fun solution(today: String, terms: Array<String>, privacies: Array<String>): ArrayList<Int> {
    var answer = arrayListOf<Int>()
    val termList = arrayListOf<Pair<String, Int>>()
    terms.forEach { term ->
        termList.add(term.split(" ").let { Pair(it.first(), it.last().toInt()) })
    }
    val caseList = arrayListOf<Pair<Triple<Int, Int, Int>, String>>()
    privacies.forEach { privacy ->
        privacy.split(" ").let {
            caseList.add(Pair(it.first().split(".").map { it.toInt() }
                .let { date -> Triple(date[0], date[1], date[2]) }, it.last()))
        }
    }
    val format = DateTimeFormatter.ofPattern("yyyy.MM.dd")
    val todayDate = LocalDate.parse(today, format)

    caseList.forEachIndexed { index, pair ->
        termList.forEach { term ->
            if (pair.second == term.first) {
                if (todayDate >= LocalDate.parse(addDate(pair.first, term.second), format)) {
                    answer.add(index+1)
                    return@forEach
                }
            }
        }
    }

    return answer
}

private fun addDate(date: Triple<Int, Int, Int>, addMonth: Int): String {
    var year = date.first
    var month = date.second
    val day = date.third

    if (date.second + addMonth > 12) {
        year += (month+addMonth) / 12
        month = if((month+addMonth) % 12 == 0) {
            year --
            12
        } else {
            (month+addMonth) % 12
        }
    } else {
        month += addMonth
    }
    return String.format("%02d.%02d.%02d", year, month, day)

}
//1/12
//1/40
//2/12 +28
//2/14 +30
//