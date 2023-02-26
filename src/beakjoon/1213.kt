package beakjoon

/**
 * 펠린드롬 문제
 * AABB -> ABBA
 * ABCBAAABB -> AAAABBBBC -> AABB C BBAA
 * 알파벳 사이즈의 Int 배열을 0으로 초기화 후 응답 받은 배열의 각 알파벳이 유니코드값을 -하여 0~26 인덱스에 ++함
 * 그 후 홀 수가 2개 이상이면 Sorry를 출력하고
 * 홀수가 하나면 사전순으로 각 알파벳 갯수를 2로 나눈 사이즈를 first문자열에 + 후 홀수인 알파벳을 더한 후 reverse한 문자열을 집어넣는다.
 * 다 짝수 갯수라면 홀수인 알파벳을 더하는 로직 을 제외하고 진행한다.
 * */
fun main() {
    val alpArray = Array<Int>(26){0}
    val answer = StringBuilder("")
    val input = readln()
    val firstArray = StringBuilder("")
    val center = StringBuilder("")
    input.toCharArray().sort()

    input.forEach {
        alpArray[it.toInt()-65]++
    }
    val count = alpArray.count { it%2 !=0 }
    if (count > 1) {
        println("I'm Sorry Hansoo")
        return
    } else if (count == 1) {
        alpArray.forEachIndexed { index, i ->
            if (i %2 != 0) {
                repeat((i-1)/2) {
                    firstArray.append((index+65).toChar())
                }
                center.append((index+65).toChar().toString())
            } else {
                repeat(i/2) {
                    firstArray.append((index+65).toChar())
                }
            }
        }
        answer.append(firstArray)
        answer.append(center)
        answer.append(firstArray.reverse())
    } else {
        alpArray.forEachIndexed { index, i ->
            repeat(i/2) {
                firstArray.append((index+65).toChar())
            }
        }
        answer.append(firstArray)
        answer.append(firstArray.reverse())
    }
    println(answer)
}
