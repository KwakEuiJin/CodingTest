package beakjoon

fun main() {
    val a = readln().toInt()
    val mutableList = readln().split(" ").map { it.toInt() }.toMutableList()

    mutableList.sort()

    val answer = if(a % 2 == 0) mutableList[(a/2) -1]
    else mutableList[((a+1)/2) - 1]

    println(answer)
}