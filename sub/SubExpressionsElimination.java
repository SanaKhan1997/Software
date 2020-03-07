package sub;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package optimizations;

/**
 *
 * @author luigibenedicenti
 *
 * @modified kcyow March 14th 2019
 *
 */
public class SubExpressionsElimination {
	double d,lim, max, sx, sy,se , x, y;
	//Refactoring 03: Pull up constructor body
	//Using constructor to assign values
	SubExpressionsElimination(){
		double d = 1.112;
        double lim = 2.234;
        double max = 3.3342;
        double sx = 4.4554;
        double sy = 3.224;
	}
	
    public void exampleNoElimination() {
        /*double d = 1.112;
        double lim = 2.234;
        double max = 3.3342;
        double sx = 4.4554;
        double sy = 3.224;*/
        x = d * (lim / max) * sx;
        y = d * (lim / max) * sy;
    }

    public void exampleElimination() {
        /*double d = 1.112;
        double lim = 2.234;
        double max = 3.3342;
        double sx = 4.4554;
        double sy = 3.224;*/
        se = d * (lim / max);
        x = se * sx;
        y = se * sy;
    }

}
