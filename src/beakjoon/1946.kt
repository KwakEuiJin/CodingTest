package beakjoon

fun main() {
    val t = readln().toInt()
    for (i in 0 until t) {
        val array = arrayListOf<Pair<Int, Int>>()
        var target = Int.MAX_VALUE
        var answer = 0
        val n = readln().toInt()
        for (j in 0 until n) {
            val input = readln().split(" ").map { it.toInt() }
            array.add((Pair(input.first(), input.last())))
        }
        array.sortBy { it.first }
        array.forEach { pair ->
            if (target > pair.second){
                target = pair.second
                answer++
            }
        }
        println(answer)
    }
}