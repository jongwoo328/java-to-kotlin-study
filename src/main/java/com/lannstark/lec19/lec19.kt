package com.lannstark.lec19


// type alias, as import
// 1. typealias는 타입에 별칭을 붙여준다
typealias MyMap = MutableMap<String, Int>

// 2. as import
// import 하면서 이름을 변경함


// 구조분해와 componentN
// 1. 구조분해
data class Person(
    val name: String,
    val age: Int
) {}

fun main() {
    val person = Person("Lannstark", 27)
    val (name, age) = person
    // data class 에는 componentN 함수가 존재
    // val name = person.component1()
    // val age = person.component2() 과 똑같다.
    // componentN 함수 : N번째 속성을 가져온다

    println("이름: $name, 나이: $age")
}

// 즉 data class가 아니어도 componentN 함수를 만들면 구조분해가 가능하다
class Person2(
    val name: String,
    val age: Int
) {
    operator fun component1(): String {
        return name
    }

    operator fun component2(): Int {
        return age
    }
}

fun main2() {
    val person = Person2("Lannstark", 27)
    val (name, age) = person
    println("이름: $name, 나이: $age")
}

// Jump, Label
// 사용 비추천

// TakeIf, TakeUnless
fun getNumberOrNull(number: Int): Int? {
    return if (number <= 0) {
        null
    } else {
        number
    }
}

fun getNumberOrNull2(number: Int): Int? {
    return number.takeIf { it > 0 }
}
