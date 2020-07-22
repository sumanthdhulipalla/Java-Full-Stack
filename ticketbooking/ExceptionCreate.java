package ticketbooking;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
public class ExceptionCreate {

	public static void main(String[] args) {
		bookticket ticket=new bookticket();
		
		Scanner myObj = new Scanner(System.in);  
	    
		while(ticket.noOfTickets>0){
			
		System.out.println("there are still "+ticket.noOfTickets);
		System.out.println("Enter tickets to be booked");
		int x = myObj.nextInt();
		
		try{
		ticket.bookTicket(x);
		System.out.println("TICKETS booked");
		}
		catch (Ticketnotavailableexception e) {
		System.out.println(e.getMessage());
		}	
		
		}
		
	}
	
}


