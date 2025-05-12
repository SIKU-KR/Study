package chapter_1

class Audience (
    val bag: Bag
){
    fun buy(ticket: Ticket): Long {
        return bag.hold(ticket)
    }
}