package kr.ac.kumoh.s20220518.w25w09_carddealer.repository

import kr.ac.kumoh.s20220518.w25w09_carddealer.model.Card

interface CardRepository {
    val cards: List<Card>
    fun save(card: Card)
    fun deleteAll()
}