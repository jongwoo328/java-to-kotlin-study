package com.lannstark.lec17


fun main() {
    // kotlin은 함수가 1급 시민이다.

    val fruits = listOf(
        Fruit("Apple", 1000),
        Fruit("Apple", 1200),
        Fruit("Apple", 1300),
        Fruit("Apple", 1400),
        Fruit("Banana", 2000),
        Fruit("Banana", 1500),
        Fruit("Grape", 4000),
        Fruit("Grape", 5000),
    )

    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "Apple"
    }

    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "Apple" }

    filterFruits(fruits, isApple)
    filterFruits(fruits, isApple2)

    filterFruits(fruits, { fruit: Fruit -> fruit.name == "Apple" })
    // 함수 파라미터가 마지막에오면 중괄호를 밖으로뺄 수 있다.
    filterFruits(fruits) { fruit -> fruit.name == "Apple" }
    // 람다의 파라미터가 한개면 it으로 사용가능
    filterFruits(fruits) { it.name == "Apple" }
}


private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    val results = mutableListOf<Fruit>()

    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }

    return results
}


private fun functionalFilterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    return fruits.filter(filter)
}
