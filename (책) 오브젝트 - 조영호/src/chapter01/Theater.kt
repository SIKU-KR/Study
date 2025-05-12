package chapter_1

class Theater (
    var ticketSeller: TicketSeller,
){
    fun enter(audience: Audience){
        ticketSeller.sellTo(audience)
    }
}