package com.trevordouglas;

public interface NhlObserver {
	
	public void update(int visitorID, int homeID, int homeScore, int visitorScore, int currentPeriod);	
	
}
