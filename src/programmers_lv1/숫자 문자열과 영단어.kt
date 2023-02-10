package programmers_lv1


fun main() {
    println(solution("one4seveneight"))
}

fun solution(s: String): Int {
    val array = arrayListOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
    var input = s
    array.forEachIndexed { index, num ->
        input = input.replace(num, index.toString())
    }
    return input.toInt()
}


//숫자    영단어
//0    zero
//1    one
//2    two
//3    three
//4    four
//5    five
//6    six
//7    seven
//8    eight
//9    nine
//"one4seveneight"	1478
//"23four5six7"	234567
//"2three45sixseven"	234567
//"123"	123