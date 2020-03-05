package A01khan269s;

import java.util.Random;

public class DrillingRobot implements Robot {
	String type = null;
	String manufacturer = null;
	Long serialNo;

	public DrillingRobot() {
		// TODO Auto-generated constructor stub
		this.type = " Drilling Robot";
		this.manufacturer = "Regina Machines";
		//Making 12 digit unique serial no. using random
		Random random = new Random();
	    StringBuilder sb = new StringBuilder();

	    // first not 0 digit
	    sb.append(random.nextInt(9) + 1);

	    // rest of 11 digits
	    for (int i = 0; i < 11; i++) {
	        sb.append(random.nextInt(10));
	    }

	     this.serialNo = Long.valueOf(sb.toString()).longValue();
	}


	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public String manufacturer() {
		// TODO Auto-generated method stub
		return manufacturer ;
	}

	@Override
	public Long serialNo() {
		// TODO Auto-generated method stub
		return serialNo;
	}

}
