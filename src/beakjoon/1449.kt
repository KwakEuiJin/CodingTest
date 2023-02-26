package beakjoon

fun main() {
    val input = readln().split(" ").map { it.toInt() }
    val n = input[0]
    val l = input[1]
    val arr = readln().split(" ").map { it.toInt() }.toIntArray()
    arr.sort()
    var count = 0

    var range = arr[0] - 0.5 + l
    count++

    for(i in 1 until n) {
        if(range < arr[i]) {
            range = arr[i] - 0.5 + l
            count++
        }
    }
    println(count)
}



