package Iterator;

public class ExtraSeat extends TicketDecorator {

	public ExtraSeat(Ticket newTicket) {
		super(newTicket);
		
		System.out.println("extra legroom seat");
	}
	
	public double getCost(double y) {
		return tempTicket.getCost(y) + 50.00;
	}
	
	

}
