package beakjoon

fun main() {
    val input = readln().split(" ")
    val n = input.first().toInt()
    var k = input.last().toInt()
    var currentIndex = 0
    val array = Array(n){0}
    var answer = 0

    for (i in n-1 downTo 0) {
        array[i] = readln().toInt()
    }

    array.forEachIndexed { index, i ->
        if (i <= k) {
            currentIndex = index
            while (k > 0 && currentIndex >= 0) {
                answer += k / array[currentIndex]
                k %=array[currentIndex]
                currentIndex --
            }
        }
    }
    println(answer)
}