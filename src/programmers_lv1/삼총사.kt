
fun main() {
    solution(intArrayOf(0,0,0))
}

private fun solution(number: IntArray): Int {
    var answer: Int = 0
    val answerList = mutableListOf<List<Int>>()
    val numberList = number.toMutableList()
    numberList.forEachIndexed { index, first ->
        numberList.drop(index + 1).forEachIndexed { index2, second ->
            numberList.drop((index + 1) + (index2 + 1)).forEach { third ->
                if (first + second + third == 0) {
                    answer++
                    answerList.add(listOf(first ,second ,third))
                }
            }
        }
    }

    println(answerList)
    println(answer)
    return answer
}