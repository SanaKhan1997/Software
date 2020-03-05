package lab01;

public class UltraTank implements Tank {
	
	int shot;
	double armour;
	double basicDamage = 1.95;
	
	public UltraTank(int damage, double shield) {
		// TODO Auto-generated constructor stub
				System.out.println("Ultra tank \n");
				this.shot = damage;
				this.armour = shield;
				recieveHit();
	}

	@Override
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
				System.out.println("Enemy not detroyed!! \n");
				
			}
			System.out.println("Current Enemy life: "+ armour);
		}
	}

}
