package lab01;

public class KillerTank implements Tank {

	int shot;
	double armour;
	double basicDamage = 2.1;

	public KillerTank(int damage, double shield) {
		// TODO Auto-generated constructor stub
		System.out.println("Killer tank \n");
		this.shot = damage;
		this.armour = shield;
		recieveHit();
	}

	public void recieveHit() {
		// TODO Auto-generated method stub
		if(armour <= 0) {
			System.out.println("Enemy Destroyed");
			return;
		}
		else {
			double calculateHitDamage = shot * basicDamage;
			if(calculateHitDamage == armour) {
				armour = armour - calculateHitDamage;
				System.out.println("Enemy Armour Destroyed!!!");
			}
			else if(calculateHitDamage > armour) {
				armour = armour - calculateHitDamage;
				System.out.println("Enemy is Dead!!");
			}
			else if(calculateHitDamage < armour) {
				armour = armour - calculateHitDamage;
				System.out.println("Enemy not destroyed!! \n");
			}
			System.out.println("Current enemy life: "+ armour);
		}
	}

}
