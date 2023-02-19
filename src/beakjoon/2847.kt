package beakjoon

fun main() {
    var count = 0
    val n = readln().toInt()
    val array = arrayListOf<Int>()
    for (i in 0 until n) {
        array.add(readln().toInt())
    }

    for (i in array.size-1 downTo 1) {
        if (array[i] <= array[i-1]) {
            count+= array[i-1] - (array[i]-1)
            array[i-1] = array[i]-1
        }
    }
    println(count)
}