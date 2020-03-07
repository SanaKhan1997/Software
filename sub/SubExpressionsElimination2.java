package sub;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package optimizations;

import java.util.Random;

/**
 *
 * @author luigibenedicenti
 *
 * @modified kcyow March 14th 2019
 *
 */ 
public class SubExpressionsElimination2 extends SuperSubExpression{
    public void exampleNoElimination() {
        /*Random gen = new Random();
        double d = gen.nextDouble();
        double lim = gen.nextDouble();
        double max = gen.nextDouble();
        double sx = gen.nextDouble();
        double sy = gen.nextDouble();*/
        double x = d * (lim / max) * sx;
        double y = d * (lim / max) * sy;
    }

    public void exampleElimination() {
        /*Random gen = new Random();
        double d = gen.nextDouble();
        double lim = gen.nextDouble();
        double max = gen.nextDouble();
        double sx = gen.nextDouble();
        double sy = gen.nextDouble();*/
        double se = d * (lim / max);
        double x = se * sx;
        double y = se * sy;
    }
    
}
