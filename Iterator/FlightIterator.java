package Iterator;

public class FlightIterator implements Iterator {
	int index = 0;
	
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(index < Database.obj.length)
			return true;
		else
			return false;
	}

	@Override
	public Database next() {
		// TODO Auto-generated method stub
		
		if(this.hasNext()) {
			index = index + 1;
			return Database.obj[index-1];
			}
		return null;
	}
	
}
