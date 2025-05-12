package chapter_1

class TicketSeller(
    var ticketOffice: TicketOffice,
) {
    fun sellTo(audience: Audience){
        ticketOffice.sellTicketTo(audience)
    }
}