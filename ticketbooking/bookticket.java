package ticketbooking;


public class bookticket{
int noOfTickets=20;


void bookTicket(int tobebooked)throws Ticketnotavailableexception
{
if(tobebooked > noOfTickets)
throw new Ticketnotavailableexception();
else {
	noOfTickets = noOfTickets - tobebooked;
}

}

}
