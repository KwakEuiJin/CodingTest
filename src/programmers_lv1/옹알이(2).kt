
fun main() {
    solution(arrayOf("ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"))
}


private fun solution(babbling: Array<String>): Int {
    var answer: Int = 0
    val babList = babbling.toMutableList()
    val canList = listOf("aya", "ye", "woo", "ma")

    babList.forEach { bab ->
        var word = bab
        for (can in canList) {
            if (bab.contains(can.repeat(2))) {
                break
            }
            word = word.replace(can, " ")
        }
        word = word.replace(" ","")
        if (word.isEmpty()) {
            answer++
            return@forEach
        }
    }
    println(answer)
    return answer
}