package decorator;

public abstract class AudiDecorator implements Car {
	
	protected Car tempCar;

	public AudiDecorator(Car newCar) {
		// TODO Auto-generated constructor stub
		tempCar = newCar;
	}
	
	public String getDescription() {
		
		return tempCar.getDescription();
	}
	
	public double getCost() {
		return tempCar.getCost();
	}

}
