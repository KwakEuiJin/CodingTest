package beakjoon

fun main() {
    val n = readln().toInt()
    val array = arrayListOf<Int>()
    var max = 0
    for (i in 0 until n) {
        array.add(readln().toInt())
    }
    array.sortDescending()
    for (i in 0 until array.size) {
        val value = array[i] * (i+1)
        if (max < value) {
            max = value
        }
    }
    println(max)
}

//10 5 20 3 4
//20 10 5 4 3

//20
//15
//16
//15