package decorator;

public class LightingPackage extends AudiDecorator {

	public LightingPackage(Car newCar) {
		// TODO Auto-generated constructor stub
		super(newCar);
		
		System.out.println("Adding special LED lighting package \n");
	}
	
	public String getDescription() {
		return tempCar.getDescription() + "LED Lighting Package";
		
	}

	public double getCost() {
		return tempCar.getCost() + 1400.00;
	}
}
