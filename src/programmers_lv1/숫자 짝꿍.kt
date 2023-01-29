
fun main() {
    println(solution("000100", "02100"))
}

private fun solution(X: String, Y: String): String {
    val number1 = mutableListOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
    val number2 = mutableListOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
    val answerList = mutableListOf<Int>()
    val answer = StringBuilder("")
    X.forEach { c1 ->
        number1.forEachIndexed { index, count ->
            if (Character.getNumericValue(c1) == index) {
                number1[index]++
            }
        }
    }
    Y.forEach { c2 ->
        number2.forEachIndexed { index, count ->
            if (Character.getNumericValue(c2) == index) {
                number2[index] ++
            }
        }
    }

    for (i in 0 until number1.size) {
            if (number1[i] < number2[i]) {
                answerList.add(number1[i])
            } else {
                answerList.add(number2[i])
            }
    }

    answerList.forEachIndexed { index, i ->
        for (j in 0 until i) {
            answer.append(index)
        }
    }
    val realAnswer = answer.split("").sortedDescending().joinToString("")

    return if (realAnswer.toString().isEmpty()) {
        "-1"
    } else if (realAnswer.toString().startsWith("0")) {
        "0"
    } else {
        realAnswer.toString()
    }
}

