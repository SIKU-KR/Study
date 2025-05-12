package chapter_2

class Reservation(
    private var customer: Customer,
    private var screening: Screening,
    private var fee: Money,
    private var audienceCount: Int
) {
}