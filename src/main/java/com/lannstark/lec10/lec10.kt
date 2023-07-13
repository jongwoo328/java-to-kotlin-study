package com.lannstark.lec10


abstract class Animal(
    protected val species: String,
    protected open val legCount: Int,
) {
    abstract fun move()
}

class Cat(
    species: String
): Animal(species, 4) {
    override fun move() {
        println("move")
    }
}

interface Flyable {
    fun act() {
        println("fly")
    }
}

interface Swimable {
    fun act() {
        println("swim")
    }
}

class Penguin(
    species: String
): Animal(species, 2), Flyable, Swimable {
    private val wingCount: Int = 2

    override fun move() {
        println("move")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }
}
