package Iterator;

public class ExcessBaggage extends TicketDecorator{

	public ExcessBaggage(Ticket newTicket) {
		super(newTicket);
	}
	
	public double getCost(double y) {
		return tempTicket.getCost(y) + 20.00;
	}

}
