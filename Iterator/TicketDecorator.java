package Iterator;

public abstract class TicketDecorator implements Ticket{
	
	protected Ticket tempTicket;
	
	public TicketDecorator(Ticket newTicket) {
		tempTicket = newTicket;
	}
	
	public double getCost(double y) {
		return tempTicket.getCost(y);
	}

}
