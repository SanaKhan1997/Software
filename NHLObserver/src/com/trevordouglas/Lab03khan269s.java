package com.trevordouglas;

public class Lab03khan269s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Current Game: Toronto Maple Leafs vs Calgary Flames\n");
		GrabInfo grab = new GrabInfo();
		GameCenter game = new GameCenter();
		
		InfoObserver observer = new InfoObserver(grab);
		
		game.addGame(new Game(game.getTeamID("Toronto Maple Leafs"), game.getTeamID("Calgary Flames")));
		
		//Setting Toronto Maple Leaf to home team
		grab.setHomeID(game.getTeamID("Toronto Maple Leafs"));
		grab.setVisitorID(game.getTeamID("Calgary Flames"));
		grab.setHomeScore(3);
		grab.setVisitorScore(2);
		grab.setCurrentPeriod(1);
		
		
		//Setting Observer Notification
		System.out.println("Observer 2 Notifications\n");
		InfoObserver observer2 = new InfoObserver(grab);
		
		grab.setHomeID(game.getTeamID("Toronto Maple Leafs"));
		grab.setVisitorID(game.getTeamID("Calgary Flames"));
		grab.setHomeScore(3);
		grab.setVisitorScore(2);
		grab.setCurrentPeriod(1);
		
		//Removing Observer 2 from notification system at the end
		grab.unregister(observer2);
		
	}

}
