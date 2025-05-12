package chapter_2

class SequenceCondition(
    private var sequence: Int
) : DiscountCondition {
    override fun isSatisfiedBy(screening: Screening): Boolean {
        return screening.isSequence(this.sequence)
    }
}