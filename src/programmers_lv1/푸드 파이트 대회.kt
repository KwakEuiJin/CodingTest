
fun main(args: Array<String>) {
    solution(intArrayOf(1, 3, 4, 6))
}

private fun solution(food: IntArray): String {
    var answer: String = ""
    var answer1: String = ""
    var answer2: String = ""
    var list = mutableListOf<Int>()
    food.toList().forEachIndexed { index, i ->
        if (index == 0) return@forEachIndexed
        //실수인 부분 홀짝 구분 안해도 됐었음
        if (i % 2 == 0) {
            list.add(i/2)
        } else {
            list.add((i-1)/2)
        }
    }
    list.forEachIndexed { index, i ->
        for (i in 0 until i) {
            answer1 +="${index+1}"
        }
    }
    answer2 = answer1.reversed()
    answer = answer1 +"0"+answer2

    println(answer)
    return answer
}