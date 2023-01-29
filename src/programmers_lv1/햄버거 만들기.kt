
fun main() {
    solution(intArrayOf(2, 1, 1, 2, 3, 1, 2, 3, 1))
}

private fun solution(ingredient: IntArray): Int {
    var answer: Int = 0
    val list = ingredient.toMutableList()
    val hamList = mutableListOf<Int>()
    list.forEachIndexed { index, i ->
        hamList.add(i)

        if (hamList.size >= 4 ) {
            val tmpList = arrayListOf<Int>()
            tmpList.addAll(hamList.subList(hamList.size -4, hamList.size))
            if (tmpList == arrayListOf(1, 2, 3, 1)) {
                answer++
                hamList.removeAt(hamList.size -4)
                hamList.removeAt(hamList.size -3)
                hamList.removeAt(hamList.size -2)
                hamList.removeAt(hamList.size -1)
            }
        }
    }
    return answer
}