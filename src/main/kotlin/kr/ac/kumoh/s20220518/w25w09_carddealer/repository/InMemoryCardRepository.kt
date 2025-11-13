package kr.ac.kumoh.s20220518.w25w09_carddealer.repository
import kr.ac.kumoh.s20220518.w25w09_carddealer.model.Card
import org.springframework.stereotype.Repository

@Repository
class InMemoryCardRepository : CardRepository {
    private val _cards: MutableList<Card> = mutableListOf()

    // 방법 3. 바람직함
    override val cards
        get() = _cards.toList()

    override fun save(card: Card) {
        if (!_cards.contains(card)) {
            _cards.add(card)
        }
    }

    override fun deleteAll() {
        _cards.clear()
    }
}