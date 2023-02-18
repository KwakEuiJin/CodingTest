package programmers_lv1

import java.lang.StringBuilder

fun main() {
    println(solution(arrayOf(arrayOf("10:00", "12:00"), arrayOf("14:00", "15:00"),arrayOf("18:00", "19:00"),arrayOf("19:00", "20:00"),arrayOf("20:00", "21:00"),)))
}

private fun solution(book_time: Array<Array<String>>): Int {
    var answer = 0
    var lastList = mutableListOf<String>()

    book_time.sortBy { it.first() }
    if (book_time.size == 1) {
        return 1
    }
    for (i in 1 until book_time.size) {
        var isAccess = false
        if (i - 1 == 0) {
            answer++
            lastList.add(book_time[0].last())
        }
        for (j in lastList.indices) {
            if (isAvailableTime(lastList[j], book_time[i].first())) {
                lastList[j] = book_time[i].last()
                isAccess = false
                break
            } else {
                isAccess = true
            }
        }
        if (isAccess) {
            lastList.add(book_time[i].last())
            answer++
        }
    }

    return answer
}

fun isAvailableTime(last: String, current: String): Boolean {
    val lastTime = last.split(":").map { it.toInt() }
    val currentTime = current.split(":").map { it.toInt() }
    val availableTime = intArrayOf(lastTime[0], lastTime[1] + 10)

    if (availableTime[1] >= 60) {
        availableTime[0] += 1
        availableTime[1] -= 60
    }

    return if (availableTime[0] < currentTime[0]) {
        true
    } else availableTime[0] == currentTime[0] && availableTime[1] <= currentTime[1]
}



