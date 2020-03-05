package Iterator;
import java.util.Scanner;

public class A02khan269s{
	/* For this assignment I have used iterator and decorator design patterns.
	 * Since we need our program to be able to iterate through the database of flights,
	 * I used iterator pattern to look for the matching departure and arrival cities with
	 * user and retrieve the flight information for each entry found
	 * 
	 * Secondly, for extra features(extra legroom, meal plan and excess baggage) I used 
	 * decorator to add the cost of selected feature with standard ticket price
	 */
	
	public static String arriveCity;
	public static String departCity;
	
	
	public static void readUserInput() {
		Scanner myObj = new Scanner(System.in);
		Scanner myObj2 = new Scanner(System.in);
		
		System.out.println("FLIGHT RESERVATION SYSTEM \n");
		
		//Ask user for departure city
		System.out.println("Enter city of departure: ");
		departCity = myObj.nextLine(); 
		
		//Ask for city of arrival
		System.out.println("Enter city of Arrival: ");
		arriveCity = myObj2.nextLine(); 
		
		if(departCity != null && arriveCity != null)
			retrieveFlight();
	}
	
	public static void retrieveFlight() {
		Database database = new Database();
		Iterator iter = new FlightIterator();
		
		String checkCity1, checkCity2;
		
		int index = 0;
		int flightNo = 0;
		int[] flightCount = new int[3];
		int selection = 0;
		
		System.out.println("\nFollowing Flights found \n");
		
		while(iter.hasNext()== true){
			database = iter.next();
			
			checkCity1 = database.getDepartCity();
			checkCity2 = database.getArrivalCity();
			
			if(departCity.equals(checkCity1) && arriveCity.equals(checkCity2)) {
				System.out.print(flightNo+1 +") ");
				flightCount[flightNo] = index;
				flightNo = flightNo + 1; 
				
				displayFlights(database);
			}
			index=index + 1;	
		}
		Scanner myFlight = new Scanner(System.in);
		System.out.println("\nEnter the corresponding number of flight for selection: ");
		selection = myFlight.nextInt();
		
		Ticket ticket = new StandardTicket();
		
		Scanner feature1 = new Scanner(System.in);
		Scanner feature2 = new Scanner(System.in);
		Scanner feature3 = new Scanner(System.in);
		
		if(!(selection == 0) && ((selection -1)< flightCount.length)) {
			
			System.out.println("Do you want to add extra legroom seat [Y/N]? ");
			if(feature1.next().startsWith("Y"))
				ticket = new ExtraSeat(ticket);
			
			System.out.println("Do you want to add in flight meals? [Y/N]? ");
			if(feature2.next().startsWith("Y"))
				ticket = new Meal(ticket);
			
			System.out.println("Do you want to add in excess baggage? [Y/N]? ");
			if(feature3.next().startsWith("Y"))
				ticket = new ExcessBaggage(ticket);
			
			double originalPrice = Database.obj[flightCount[selection - 1]].getPrice();
			
			System.out.println("\nPRINGTING TICKET");
			System.out.println("Departure: "+Database.obj[flightCount[selection - 1]].getDepartCity());
			System.out.println("Arrival: "+ Database.obj[flightCount[selection - 1]].getArrivalCity());
			System.out.println("Time: " + Database.obj[flightCount[selection - 1]].getTime());
			System.out.println("Ticket Price: $" + ticket.getCost(originalPrice));
		}
		
	}
	
	public static void displayFlights(Database object) {
		System.out.println(object.getDepartCity() +" to "+ object.getArrivalCity());
		System.out.println("Time: "+ object.getTime()+ "\nPrice: $"+ object.getPrice() + "\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Database.obj[0] = new Database();
	    Database.obj[1] = new Database();
	    Database.obj[2] = new Database();
	    
	    Database.obj[0].setData("Regina","Vancouver", 09.00, 300.00);
	    Database.obj[1].setData("Regina", "Vancouver", 15.00, 350.00);
	    Database.obj[2].setData("Regina", "Toronto", 13.00, 500.00);
	    
	    
	    readUserInput();	

	}

}
