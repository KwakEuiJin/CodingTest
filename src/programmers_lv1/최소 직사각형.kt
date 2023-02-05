package programmers_lv1

fun main() {
    println(
        solution(
            arrayOf(
                intArrayOf(60, 50),
                intArrayOf(30, 70),
                intArrayOf(60, 30),
                intArrayOf(80, 40),
            )
        )
    )
}

private fun solution(sizes: Array<IntArray>): Int {
    val aArray = arrayListOf<Int>()
    val bArray = arrayListOf<Int>()
    sizes.forEachIndexed { index, ints ->
        if (ints[0] > ints[1]) {
            aArray.add(ints.first())
            bArray.add(ints.last())
        } else {
            bArray.add(ints.first())
            aArray.add(ints.last())
        }
    }
    return aArray.sortedDescending()[0] * bArray.sortedDescending()[0]
}

