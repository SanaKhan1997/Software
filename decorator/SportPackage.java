package decorator;

public class SportPackage extends AudiDecorator{

	public SportPackage(Car newCar) {
		// TODO Auto-generated constructor stub
		super(newCar);
		
		System.out.println("Adding sport package \n");
	}
	
	public String getDescription() {
		return tempCar.getDescription() + "Sport Package";
		
	}
	
	public double getCost() {
		return tempCar.getCost() + 9000.00;
	}

}
