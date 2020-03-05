package Iterator;

public class Database implements Container{
	String departureCity, arrivalCity;
	double departureTime, price;
	
	static Database obj[] = new Database[3] ;
	
	
	public void setData(String dCity, String aCity, double time, double cost) {
		departureCity = dCity;
		arrivalCity = aCity;
		departureTime = time;
		price = cost;
	}
	
	public String getDepartCity() {
		return departureCity;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public double getTime() {
		return departureTime;
	}
	public double getPrice() {
		return price;
	}


	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new FlightIterator();
	}

}
