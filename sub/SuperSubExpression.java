package sub;
import java.util.Random;
//Refactoring 05: Extract Super Class

public abstract class SuperSubExpression {
	double d,lim, max, sx, sy,se , x, y;
	
	SuperSubExpression(){
		Random gen = new Random();
        d = gen.nextDouble();
        lim = gen.nextDouble();
        max = gen.nextDouble();
        sx = gen.nextDouble();
        sy = gen.nextDouble();
	}
	public abstract void exampleNoElimination();
	public abstract void exampleElimination();
	
}
