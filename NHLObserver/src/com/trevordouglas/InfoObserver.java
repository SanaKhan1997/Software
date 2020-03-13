package com.trevordouglas;

public class InfoObserver implements NhlObserver{
	private int homeGameID;
	private int visitorGameID;
	private int homeScore;
	private int visitorScore;
	private int currentPeriod;
	
	private static int gameIDTracker = 0;
	
	private int observerID;
	
	private Subject infoGrabber;
	
	public InfoObserver(Subject infoGrabber) {
		this.infoGrabber = infoGrabber;
		this.observerID = ++gameIDTracker;
		System.out.println("Observer " + this.observerID);
		
		infoGrabber.register(this);
		
	}

	public void update(int visitorID, int homeID, int homeScore, int visitorScore, int currentPeriod) {
		// TODO Auto-generated method stub
		this.homeGameID = homeID;
		this.visitorGameID = visitorID;
		this.homeScore = homeScore;
		this.visitorScore = visitorScore;
		this.currentPeriod = currentPeriod;
		
		printInformation();
	}
	
	public void printInformation() {
		System.out.println("NHL Observer: "+ observerID +"\nHome Team ID: " + homeGameID +": "+"\nHome Score: "+homeScore);
		System.out.println("Visitor Team ID: "+ visitorGameID+ "\nVisitor Score: "+ visitorScore+"\nPeriod: " + currentPeriod + "\n");
	}
	
}
