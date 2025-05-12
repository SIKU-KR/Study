package chapter_1

class TicketOffice(
    var amount: Long, vararg tickets: Ticket
) {
    val tickets: MutableList<Ticket> = ArrayList()

    init {
        this.tickets.addAll(tickets)
    }

    fun getTicket(): Ticket {
        return this.tickets.removeFirst()
    }

    fun plusAmount(amount: Long) {
        this.amount += amount
    }

    fun sellTicketTo(audience: Audience){
        plusAmount(audience.buy(getTicket()))
    }
}