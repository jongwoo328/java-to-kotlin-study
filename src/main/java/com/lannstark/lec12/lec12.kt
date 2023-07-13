package com.lannstark.lec12

class Person private constructor(
    var name: String,
    var age: Int
) {
    // static 대신 companion object
    // 클래스와 동행하는(companion) 오브젝트 -> 객체간 공유한다는 의미
    // companion object는 말그대로 object이므로 이름 붙일수도있고, interface를 구현할 수도 있음
    companion object Factory {
        // const -> 컴파일 시점에 할당하는 상수
        private const val MIN_AGE = 1

        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }
    }

}

// kotlin에서 singleton은 object로 만듦
object Singleton {
    var a: Int = 0
}

private fun moveSomthing(movable: Movable) {
    movable.move()
    movable.fly()
}

fun main() {
    // companion object 이름 없는경우
//    Person.Companion.newBaby("Lannstark")
    Person.newBaby("Lannstark")

    // companion object 이름 있는경우
    Person.Factory.newBaby("Lannstark")
    Person.newBaby("Lannstark")

    // JvmStatic annotation을 붙이면 Java에서도 static으로 사용가능
    //```java
    //Person p = Person.newBaby("Lannstark");
    //```


    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)

    // 익명 클래스
    moveSomthing(object: Movable {
        override fun move() {
            println("move")
        }

        override fun fly() {
            println("fly")
        }
    })
}
