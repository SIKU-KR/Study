package chapter_2

interface DiscountCondition {
    fun isSatisfiedBy(screening: Screening): Boolean
}