package decorator;

public class lab02khan269s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car Car = new Audi();
		
		Car Car1 = new Audi();
		
		Car Car2 = new Audi();
		
		Car Car3 = new Audi();
		
		Car Car4 = new Audi();
		
		Car = new ComfortPackage(Car);
		
		System.out.println(Car.getDescription() + "\nCost =  $" + Car.getCost() + "\n");

		Car1 = new AssistancePackage(Car1);
		
		System.out.println(Car1.getDescription() + "\nCost =  $" + Car1.getCost() + "\n");
		
		Car2 = new LightingPackage(Car2);
		
		System.out.println(Car2.getDescription() + "\nCost =  $" + Car2.getCost() + "\n");
		
		Car3 = new NavigationPackage(Car3);
		
		System.out.println(Car3.getDescription() + "\nCost =  $" + Car3.getCost() + "\n");
		
		Car4 = new SportPackage(Car4);
		
		System.out.println(Car4.getDescription() + "\nCost =  $" + Car4.getCost() + "\n");
	}

}
