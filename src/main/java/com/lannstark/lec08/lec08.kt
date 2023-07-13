package com.lannstark.lec08

fun max(a: Int, b: Int) = if (a > b) a else b

fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

fun printAll(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}

fun main() {
    repeat("test", 3, true)
    repeat("test", useNewLine = false)

    printNameAndGender(name = "name", gender = "gender")
    // Java 함수를 호출할때는 named parameter를 사용할 수 없음

    printAll("a", "b", "c")

    val array = arrayOf("a", "b", "c")
    // kotlin에서 가변인자로 배열을 줄 때는 * (spread operator) 사용해야함
    printAll(*array)
}
