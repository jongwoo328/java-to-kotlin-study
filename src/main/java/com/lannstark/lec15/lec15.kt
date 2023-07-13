package com.lannstark.lec15


fun main() {
    // 배열
    val array1 = arrayOf(100, 200)

    for (i in array1.indices)  {
        println("${i} ${array1[i]}")
    }

    for ((index, value) in array1.withIndex()) {
        println("$index $value")
    }

    array1.plus(300)

    // collection
    // 컬렉션이 불변인지, 가변인지 설정해야한다
    // 가변: element 추가, 삭제 가능
    // 불변: element 추가, 삭제 불가능

    // list
    val numbers = listOf(100, 200)
    val emptyList = emptyList<Int>()
    println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) {
        println("$idx $value")
    }

    val mutableNumbers = mutableListOf(100, 200)
    mutableNumbers.add(300)

    // set
    val numberSet = setOf(100, 200)
    val mutableNumberSet = mutableSetOf(100, 200)

    // map
    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    val map = mapOf(1 to "MONDAY", 2 to "TUESDAY")
}
