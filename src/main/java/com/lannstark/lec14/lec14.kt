package com.lannstark.lec14


data class PersonDto(
    val name: String,
    val age: Int
) {}

enum class Country (
    private val code: String
) {
    KOREA("KO"),
    AMERICA("US"),
}

fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> println("한국")
        Country.AMERICA -> println("미국")
    }
}

fun main() {
    val dto1 = PersonDto("Lannstark", 27)
    val dto2 = PersonDto("Lannstark", 27)
    println(dto1 == dto2)

    val dto3 = PersonDto(name = "Lannstark", age = 27)
}
