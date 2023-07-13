package com.lannstark.lec13

import com.lannstark.lec13.JavaHouse.LivingRoom


class House (
    private val address: String,
    private val livingRoom: LivingRoom
) {
    // 바깥 클래스를 참조하려는 경우 inner 키워드 추가 필요
    inner class LivingRoom(
        private val area: Double
    ) {
        val address: String
            // 바깥클래스 참조 : @ 사용
            get() = this@House.address
    }
}

