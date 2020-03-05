package lab01;

import java.util.Scanner;

public class lab01khan269s {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("WORLD OF TANKS \n");
		System.out.println("\nSelect tank type[Basic(B)/Advance(A)/Ultra(U)/Killer(K)/Invisible(I)]:");
		
		String UserType = input.next();
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Insert current armour life of enemy:");
		double armour = input1.nextDouble();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Now enter number of hits");
		int hit = input2.nextInt();
		//The input that is required includes tank type that user wants, current enemy life and no. of hits to calculate damage in respective class of tank
		
		System.out.println("Tank made");
		switch(UserType){
		case "B":
			TankFactory.createTank(TankType.BasicTank, hit, armour);
			break;
		case "A":
			TankFactory.createTank(TankType.AdvanceTank, hit, armour);
			break;
		case "U":
			TankFactory.createTank(TankType.UltraTank, hit, armour);
			break;
		case "K":
			TankFactory.createTank(TankType.KillerTank, hit, armour);
			break;
		case "I":
			TankFactory.createTank(TankType.InvisibleTank, hit, armour);
			break;
		}

	}

}
