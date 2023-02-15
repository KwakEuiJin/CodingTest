package beakjoon

fun main() {
    val input = readln().toCharArray().sortedArrayDescending()
    if (!input.contains('0') || input.map { Character.getNumericValue(it).toBigDecimal() }.sumOf { it } % 3.toBigDecimal() != 0.toBigDecimal()) {
        println("-1")
        return
    }
    println(input.joinToString("").toBigDecimal())
}


