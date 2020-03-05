package decorator;

public class NavigationPackage extends AudiDecorator{

	public NavigationPackage(Car newCar) {
		// TODO Auto-generated constructor stub
		super(newCar);
		
		System.out.println("Adding special Navigation Package package \n");
	}
	
	public String getDescription() {
		return tempCar.getDescription() + "Navigation Package";
	}
	
	public double getCost() {
		return tempCar.getCost() + 2000.00;
	}

}
