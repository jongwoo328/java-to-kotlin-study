package com.lannstark.lec09

class Person(
    // 자동으로 생성자 역할 함 (primary constructor)
    val name: String,
    // default parameter 사용가능
    var age: Int = 1
) {
    init {
        // class가 생성될 때 실행되는 코드
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    // 생성자 추가하기
    // 하지만 default parameter, 팩토리메소드를 추천
    constructor(name: String) : this(name, 1)

    // property getter
    fun isAdult(): Boolean {
        return this.age >= 20
    }

    val isAdult: Boolean
        get() = this.age >= 20

}

fun main() {
    val person = Person("Lannstark", 27)
    println(person.name)
    person.age = 10
    println(person.age)
}
