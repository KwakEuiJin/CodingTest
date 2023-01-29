
fun main() {
    solution(2,1,20)
}

private fun solution(a: Int, b: Int, n: Int): Int {
    var answer: Int = 0
    var bottle = n
    while (bottle >= a) {
        val receiveBottle = (bottle/a)*b
        bottle = receiveBottle + (bottle%a)
        answer += receiveBottle
    }
    println(answer)
    return answer
}