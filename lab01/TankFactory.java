package lab01;

public class TankFactory {

	// Tank factory decides which tank to create using switch statements
	public static void createTank(TankType type, int damage, double shield) {
	// Note damage and shield represents no. of hits and life of enemy before hits
		Tank tank = null;
		switch(type) {
		case BasicTank:
			tank = new BasicTank(damage, shield);
			break;
		case AdvanceTank:
			tank = new AdvanceTank(damage, shield);
			break;
		case UltraTank:
			tank = new UltraTank(damage, shield);
			break;
		case KillerTank:
			tank = new KillerTank(damage, shield);
			break;
		case InvisibleTank:
			tank = new InvisibleTank(damage, shield);
			break;
		default:
			break;
			
		}
		
		
	}

}
