package chapter_2

import kotlin.time.Duration

class Movie(
    private var name: String,
    private var runningTime: Duration,
    private var fee: Money,
    private var discountPolicy: DiscountPolicy
) {
    fun getFee(): Money {
        return this.fee
    }

    fun calculateMovieFee(screening: Screening): Money{
        return fee.minus(discountPolicy.calculateDiscountAmount(screening))
    }
}