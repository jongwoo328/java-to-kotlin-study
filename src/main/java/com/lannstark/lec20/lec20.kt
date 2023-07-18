package com.lannstark.lec20

import com.lannstark.lec03.Person


// scope function
// 람다를 사용해 일시적인 영역을 만들고 코드를 간결하게 만들거나 메서드 체이닝에 활용

fun printPerson(person: Person?) {
    person?.let {
        println(it.name)
        println(it.age)
    }
}

val person = Person("Lannstark", 27)

// let, run, also, apply, with (with만 확장함수가 아님)
// let, run : 람다의 결과를 반환
// also, apply: 객체 그 자체를 반환

// it : 다른 일므을 붙일 수 있음, 생략불가능
// this: 다른 이름을 붙일 수 없음, 생략가능

// let, also: 일반 함수를 인자로 받음 (파라미터 이름을 넣어줄 수 있다)
// run, apply: 확장 함수를 인자로 받음 (자신을 this로 호출하고, 생략할 수 있다)

// with: this를 사용해 접근하고, 생략가능하다


fun main() {
    // let
    // 하나 이상의 함수를 call chain 결과로 호출할 때
    val strings = listOf("A", "B")
    strings.map { it.length }.filter { it > 3 }.let(::println)
    // non-null 값에 대해서만 코드를 실행시킬 때
    val str = "ABC"
    val length = str.let {
        println(it.uppercase())
        it.length
    }
    // 일화성으로 제한된 영역에 지역변수를 만들 때
    val numbers = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers.first().let { firstItem ->
        if (firstItem.length >= 5) firstItem else "!$firstItem!"
    }.uppercase()
    println(modifiedFirstItem)

    // run
    // 객체 초기화와 반환값의 계산을 동시에 할 때

    // 객체를 만들어 DB에 저장하고 바로 활용할 때
//    val p = Person("Lannstark", 27).run {
//        hobby = "독서",
//        personRepository.save(this)
//    }

    // apply
    // 객체 설정을 할 때 객체를 수정하는 로직이 call chain 중간에 있는 경우
//    fun createPerson(
//        name: String,
//        age: Int,
//        hobby: String
//    ) {
//        return Person(
//            name = name,
//            age = age
//        ).apply {
//            this.hobby = hobby
//        }
//    }


    // also
    // 객체를 수정하는 로직이 call chain 중간에 있는 경우
    mutableListOf("one", "two", "three")
        .also { println("hello") }
        .add("four")


    // with
    // 특정 객체를 다른 객체로 변환해야하는데, 정적 팩토리 혹은 toClass등 함수를 만들기 어려운 경우
//    return with(person) {
//        PersonDto(
//            name = name,
//            age = age
//        )
//    }
}
