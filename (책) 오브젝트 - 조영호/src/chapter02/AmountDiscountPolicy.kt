package chapter_2

class AmountDiscountPolicy(
    private val discountAmount: Money,
    vararg conditions: DiscountCondition
) : DiscountPolicy(*conditions) {
    override fun getDiscountAmount(screening: Screening): Money {
        return discountAmount
    }
}
