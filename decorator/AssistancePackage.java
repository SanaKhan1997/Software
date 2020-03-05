package decorator;

public class AssistancePackage extends AudiDecorator{

	public AssistancePackage(Car newCar) {
		// TODO Auto-generated constructor stub
		super(newCar);
		
		System.out.println("Adding driver's assistance package \n");
	}
	
	public String getDescription() {
		return tempCar.getDescription() + "Assistance Package";
	}
	
	
	public double getCost() {
		return tempCar.getCost() + 1950.00;
		
	}

}
