package com.lannstark.lec04

fun main() {

    val money1 = JavaMoney(1000L)
    val money2 = money1
    val money3 = JavaMoney(1000L)

    println(money1 > money2)
    println(money1 === money2) // true, 주소 비교
    println(money1 == money3) // true, 값 비교
}
