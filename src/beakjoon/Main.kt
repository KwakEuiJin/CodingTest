package beakjoon

fun main() {
    val numbers = (1..10).toList()

    val sumUsingReduce = numbers.reduce {total, num ->
        total + num
    }
    println(sumUsingReduce) // 55
}