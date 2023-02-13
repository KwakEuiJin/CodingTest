package beakjoon

fun main() {
    var answer = 0L
    var minPrice =  Long.MAX_VALUE
    val n = readln()
    val lengthArray = readln().split(" ").map { it.toLong() }
    val priceArray = readln().split(" ").map { it.toLong() }

    priceArray.forEachIndexed { index, price ->
        if (minPrice > price ) {
            minPrice = price
        }
        if (index != priceArray.size-1) {
            answer += minPrice * lengthArray[index]
        }
    }
    println(answer)
}


//2,3,1
//5,4,2,1
