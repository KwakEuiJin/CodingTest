package programmers_lv1

fun main() {
    solution(
        arrayOf("con", "ryan"),
        arrayOf("ryan con", "ryan con", "ryan con", "ryan con"),
        2
    )
}

private fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
    val countArray = Array(id_list.size) { 0 }
    val reporterArray = Array<String>(id_list.size) { "" }
    val caosArray = Array<String>(id_list.size) { "" }
    val answerArray = Array(id_list.size) { 0 }

    report.distinct().forEachIndexed { index, s ->
        val userList = s.split(" ")
        reporterArray[id_list.indexOf(userList[1])] += "${userList[0]} "
        caosArray[id_list.indexOf(userList[1])] += "${userList[1]} "
    }

    val distinctReporterList = reporterArray.map { it.split(" ").distinct().joinToString(" ") }

    caosArray.forEachIndexed { index, s ->
        val userList = s.split(" ")
        userList.forEach {
            if (it.isNotEmpty()) {
                countArray[id_list.indexOf(it)]++
            }
        }

    }

    countArray.forEachIndexed { index, i ->
        val userList = distinctReporterList[index].split(" ")
        if (i >= k) {
            userList.forEach {
                if (it.isNotEmpty()) {
                    answerArray[id_list.indexOf(it)]++
                }
            }
        }
    }
    answerArray.map {
        println(it)
    }

    return answerArray.toIntArray()
}