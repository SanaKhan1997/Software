package decorator;

public class ComfortPackage extends AudiDecorator {

	public ComfortPackage(Car newCar) {
		// TODO Auto-generated constructor stub
		super(newCar);
		
		System.out.println("Adding special Seating package \n");
	}
	
	public String getDescription() {
		return tempCar.getDescription() + "Comfort Seating Package";
	}
	
	public double getCost() {
		return tempCar.getCost() + 1450.00;
	}
}
