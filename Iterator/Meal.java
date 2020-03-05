package Iterator;

public class Meal extends TicketDecorator {

	public Meal(Ticket newTicket) {
		super(newTicket);
	}
	
	public double getCost(double y) {
		return tempTicket.getCost(y) + 10.00;
	}
	
}
