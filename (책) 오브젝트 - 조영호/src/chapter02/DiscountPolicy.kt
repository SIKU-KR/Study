package chapter_2

abstract class DiscountPolicy(
    vararg conditions: DiscountCondition
) {
    private val conditions: MutableList<DiscountCondition> = ArrayList()

    init {
        this.conditions.addAll(conditions.toMutableList())
    }

    fun calculateDiscountAmount(screening: Screening): Money{
        for (condition in conditions){
            if(condition.isSatisfiedBy(screening)){
                return getDiscountAmount(screening)
            }
        }
        return Money.ZERO
    }

    protected abstract fun getDiscountAmount(screening: Screening): Money
}