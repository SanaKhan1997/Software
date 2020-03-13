package com.trevordouglas;

import java.util.ArrayList;

public class GrabInfo implements Subject{
		private ArrayList<NhlObserver> gameObservers;
	
		private int homeGameID;
		private int visitorGameID;
		private int homeScore;
		private int visitorScore;
		private int currentPeriod;
		
		public GrabInfo() {
			gameObservers = new ArrayList<NhlObserver>();
		}

		public void register(NhlObserver newGameObserver) {
			gameObservers.add(newGameObserver);
			
		}
		
		public void unregister(NhlObserver removeObserver) {
			int index = gameObservers.indexOf(removeObserver);
			System.out.println("Observer "+(index+1)+" Removed\n");
			gameObservers.remove(index);
		}
		
		public void notifyUsers() {
			for(NhlObserver observer: gameObservers) {
				observer.update(visitorGameID, homeGameID, homeScore, visitorScore, currentPeriod);
			}
			
		}
		
		public void setVisitorID(int newVisitorID) {
			this.visitorGameID = newVisitorID;
			notifyUsers();
		}
		
		public void setHomeID(int newHomeID) {
			this.homeGameID = newHomeID;
			notifyUsers();
		}
		
		public void setHomeScore(int newHomeScore) {
			this.homeScore = newHomeScore;
			notifyUsers();
		}
		
		public void setVisitorScore(int newVisitScore) {
			this.visitorScore = newVisitScore;
			notifyUsers();
		}
		
		public void setCurrentPeriod(int newCurrentPeriod) {
			this.currentPeriod = newCurrentPeriod;
			notifyUsers();
		}
}

