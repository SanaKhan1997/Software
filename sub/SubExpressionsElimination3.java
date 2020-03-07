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
public class SubExpressionsElimination3 extends SuperSubExpression {


    public void exampleNoElimination() {
        double x = d * (lim / max) * sx;
        double y = d * (lim / max) * sy;
    }

    public void exampleElimination() {
        double se = d * (lim / max);
        double x = se * sx;
        double y = se * sy;
    }

   /* public void SubExpressionsElimination() {
        gen = new Random();
        d = gen.nextDouble();
        lim = gen.nextDouble();
        max = gen.nextDouble();
        sx = gen.nextDouble();
        sy = gen.nextDouble();
    }*/
}
