package com.lannstark.lec03

fun main() {
    val number1 = 3 // Int
    val number2: Long = number1.toLong()

    println(number1 + number2)

    val person = Person()
    println("이름: ${person.name}, 나이: ${person.age}")

    // string indexing
    val str = "ABC"
    println(str[0])
}

class Person {
    var name: String = ""
    var age: Int = 0
}

fun printAgeIfPerson(obj: Any) {
    // as? -> value가 null이면 null
    var maybePerson: Person? = obj as? Person

    // instanceof
    if (obj is Person) {
        println(obj.age)
    }
    // ! instanceof
    if (obj !is Person) {
        println("Not a Person")
    }
}

/**
 * 1. Any
 *  - Java의 Object 역할 (최상위 타입)
 *  - 모든 primitive의 최상위 타입이기도 함
 *  - null 표현할 수 없음 (null 포함하고 싶다면 Any? 사용해야함)
 *  - equals, hash, toString 존재
 *
 * 2. Unit
 *  - Java의 void와 동일
 *  - Unit 타입의 변수는 선언할 수 없음
 *  - void와 다르게 그자체로 타입인자로 사용가능
 *
 * 3. Nothing
 *  - 함수가 정상적으로 끝나지 않았다는 사실을 표현
 *  - 무조건 예외 반환 or 무한루프 함수 등
 */
