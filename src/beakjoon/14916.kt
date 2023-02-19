package beakjoon

fun main() {
    val input = readln().toInt()
    var count = 0
    if (input == 1 || input == 3) {
        println(-1)
        return
    }

    if ((input % 5) == 0) {
        count = (input / 5)
    } else if (input < 5) {
        count = input / 2
    } else if ((input % 5) % 2 == 0) {
        count += input / 5
        count += (input % 5) / 2
    } else {
        count += (input / 5) - 1
        count += (input - (5 * ((input / 5) - 1))) / 2
    }

    println(count)
}

//1. 5의 배수인지? (가장 적게 사용)
//
//2. 5보다 큰데, 5원으로 나눈 경우 2원으로 계산이 된다면?
//
//3. 5보다 큰데, 5원으로 나눈 경우 2원으로 계산이 안 된다면?
//
//4. 만약 5원보다 작다면?