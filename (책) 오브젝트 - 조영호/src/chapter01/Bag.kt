package chapter_1

class Bag(
    var amount: Long,
    var invitation: Invitation?,
) {
    var ticket: Ticket? = null

    fun hold(ticket: Ticket): Long{
        if(hasInvitation()){
            this.ticket = ticket
            return 0L
        } else {
            this.ticket = ticket
            minusAmount(ticket.fee)
            return ticket.fee
        }
    }

    fun hasInvitation(): Boolean {
        return invitation != null
    }

    fun minusAmount(amount: Long){
       this.amount -= amount
    }
}