package ticketbooking;

public class Ticketnotavailableexception extends Exception{

@Override
public String getMessage() {
return "Tickes sold out";
}
}