package com.lannstark.lec16

// 확장함수
// Java 코드가 있는 상황에서 Kotlin 코드로 추가 개발을 하기 위해 등장
// 확장함수와 멤버함수의 시그니쳐가 동일하면 멤버함수가 호출된다
// 현재 타입을 기준으로 호출 (실제 인스턴스의 타입과 무관)

// String 안에 있는 메서드인것 처럼 확장 가능
fun String.lastChar(): Char {
    return this[this.length - 1]
}

// 확장 프로퍼티
// 확장 프롵퍼티의 원리는 확장함수 + custom getter와 동일하다
val String.lastChar2: Char
    get() = this[this.length - 1]

// 중위함수
// 함수 호출방식을 바꿔줌
infix fun Int.add(other: Int): Int {
    return this + other
}

var a1 = 3.add(4)
var a2 = 3 add 4

// inline 함수
// 함수 내용을 복사해줌
// 함수를 파라미터로 전달할 때 오버헤드를 줄일 수 있다
// 하지만 신중하게 성능측정하에 사용할것, 일반적으로 많이 쓰지않음
inline fun Int.add2(other: Int): Int {
    return this + other
}
var b = 3.add2(4)

fun main() {
    val str = "ABC"
    println(str.lastChar())

}
