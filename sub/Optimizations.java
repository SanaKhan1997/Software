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
public class Optimizations {
static long tBeg, tEnd;
static int testSize = 1000;
    /**
     * @param args the command line arguments
     */
//Refactoring 04: Extract functions for better readability
//Function to run test 1
	public static void strengthReductionTest() {
		StrengthReduction test1 = new StrengthReduction();
        tBeg = System.nanoTime();
        test1.recursiveSum(testSize);
        tEnd = System.nanoTime();
        System.out.println("Strength reduction\n Recursive time:" + (tEnd - tBeg));
        
        tBeg = System.nanoTime();
        test1.unreducedSum(testSize);
        tEnd = System.nanoTime();
        System.out.println(" Iterative time:" + (tEnd - tBeg));
        
        tBeg = System.nanoTime();
        test1.reducedSum(testSize);
        tEnd = System.nanoTime();
        System.out.println(" Direct time:" + (tEnd - tBeg));
	}
	//Function to run test2
	public static void subExpessionTest1() {
		SubExpressionsElimination test2 = new SubExpressionsElimination();
        tBeg = System.nanoTime();
        test2.exampleNoElimination();
        tEnd = System.nanoTime();
        System.out.println("\n\nSub Expression elimination (preassigned numbers)\n Before time:" + (tEnd - tBeg));
        
        tBeg = System.nanoTime();
        test2.exampleElimination();
        tEnd = System.nanoTime();
        System.out.println(" After time:" + (tEnd - tBeg));
	}
	//Function to run test 3
	public static void subExpressionTest2() {
		SuperSubExpression test3 = new SubExpressionsElimination2();
		//SubExpressionsElimination2 test3 = new SubExpressionsElimination2();
        tBeg = System.nanoTime();
        test3.exampleNoElimination();
        tEnd = System.nanoTime();
        System.out.println("\n\nSub Expression elimination (random numbers)\n Before time:" + (tEnd - tBeg));
        
        tBeg = System.nanoTime();
        test3.exampleElimination();
        tEnd = System.nanoTime();
        System.out.println(" After time:" + (tEnd - tBeg));
	}
	//Function for test 4
	public static void subExpressionTest3() {
		SuperSubExpression test4 = new SubExpressionsElimination3();
		//SubExpressionsElimination3 test4 = new SubExpressionsElimination3();
        tBeg = System.nanoTime();
        test4.exampleNoElimination();
        tEnd = System.nanoTime();
        System.out.println("\n\nSub Expression elimination (random numbers in constructor)\n Before time:" + (tEnd - tBeg));
        
        tBeg = System.nanoTime();
        test4.exampleElimination();
        tEnd = System.nanoTime();
        System.out.println(" After time:" + (tEnd - tBeg));
	}
	//Function for test 5
	public static void codeMotionTest() {
		CodeMotion test5 = new CodeMotion();
        tBeg = System.nanoTime();
        test5.codeInsideLoop();
        tEnd = System.nanoTime();
        System.out.println("\n\nCode Motion\n Before time:" + (tEnd - tBeg));
        
        tBeg = System.nanoTime();
        test5.codeOutsideLoop();
        tEnd = System.nanoTime();
        System.out.println(" After time:" + (tEnd - tBeg));
	}
	//Function for test 6
	public static void arrayVsListTest() {
		ArrayListvsLinkedList test6 = new ArrayListvsLinkedList();
        tBeg = System.nanoTime();
        test6.arrayListCreation();
        tEnd = System.nanoTime();
        System.out.println("\n\nArrayLists vs LinkedLists\n ArrayList Creation:" + (tEnd - tBeg));

        tBeg = System.nanoTime();
        test6.arrayListCreation();
        tEnd = System.nanoTime();
        System.out.println(" LinkedList Creation:" + (tEnd - tBeg));

        tBeg = System.nanoTime();
        test6.arrayListAccess();
        tEnd = System.nanoTime();
        System.out.println(" ArrayList Access:" + (tEnd - tBeg));

        tBeg = System.nanoTime();
        test6.arrayListAccess();
        tEnd = System.nanoTime();
        System.out.println(" LinkedList Access:" + (tEnd - tBeg));	
	}
	//Function for test 7
	public static void stringOperationTest()
	{
		 StringOperations test7 = new StringOperations();
	        tBeg = System.nanoTime();
	        test7.usingPlus();
	        tEnd = System.nanoTime();
	        System.out.println("\n\nString Operations\n Using + :" + (tEnd - tBeg));

	        tBeg = System.nanoTime();
	        test7.usingStringBuffer();
	        tEnd = System.nanoTime();
	        System.out.println(" Using StringBuffer :" + (tEnd - tBeg));
	}
	
    public static void main(String[] args) {
        
        System.out.println("Optimization example program\n\n");
        //Calling extracted functions
        strengthReductionTest();
        subExpessionTest1();
        subExpressionTest2();
        subExpressionTest3();
        codeMotionTest();
        arrayVsListTest();
        stringOperationTest();
        
        //Refactoring 04: Extract functions for better readability
        
        /*StrengthReduction test1 = new StrengthReduction();
        tBeg = System.nanoTime();
        test1.recursiveSum(testSize);
        tEnd = System.nanoTime();
        System.out.println("Strength reduction\n Recursive time:" + (tEnd - tBeg));
        
        tBeg = System.nanoTime();
        test1.unreducedSum(testSize);
        tEnd = System.nanoTime();
        System.out.println(" Iterative time:" + (tEnd - tBeg));
        
        tBeg = System.nanoTime();
        test1.reducedSum(testSize);
        tEnd = System.nanoTime();
        System.out.println(" Direct time:" + (tEnd - tBeg));
        
        SubExpressionsElimination test2 = new SubExpressionsElimination();
        tBeg = System.nanoTime();
        test2.exampleNoElimination();
        tEnd = System.nanoTime();
        System.out.println("\n\nSub Expression elimination (preassigned numbers)\n Before time:" + (tEnd - tBeg));
        
        tBeg = System.nanoTime();
        test2.exampleElimination();
        tEnd = System.nanoTime();
        System.out.println(" After time:" + (tEnd - tBeg));
        
        SubExpressionsElimination2 test3 = new SubExpressionsElimination2();
        // Initialize random number generator: do it in the class or here?
        //Random rd = new Random();
        tBeg = System.nanoTime();
        test3.exampleNoElimination();
        tEnd = System.nanoTime();
        System.out.println("\n\nSub Expression elimination (random numbers)\n Before time:" + (tEnd - tBeg));
        
        tBeg = System.nanoTime();
        test3.exampleElimination();
        tEnd = System.nanoTime();
        System.out.println(" After time:" + (tEnd - tBeg));
        
        SubExpressionsElimination3 test4 = new SubExpressionsElimination3();
        tBeg = System.nanoTime();
        test4.exampleNoElimination();
        tEnd = System.nanoTime();
        System.out.println("\n\nSub Expression elimination (random numbers in constructor)\n Before time:" + (tEnd - tBeg));
        
        tBeg = System.nanoTime();
        test4.exampleElimination();
        tEnd = System.nanoTime();
        System.out.println(" After time:" + (tEnd - tBeg));
        
        CodeMotion test5 = new CodeMotion();
        // Note that the default constructor is lazy and initializes only when the class is needed in this case
        tBeg = System.nanoTime();
        test5.codeInsideLoop();
        tEnd = System.nanoTime();
        System.out.println("\n\nCode Motion\n Before time:" + (tEnd - tBeg));
        
        tBeg = System.nanoTime();
        test5.codeOutsideLoop();
        tEnd = System.nanoTime();
        System.out.println(" After time:" + (tEnd - tBeg));

        ArrayListvsLinkedList test6 = new ArrayListvsLinkedList();
        tBeg = System.nanoTime();
        test6.arrayListCreation();
        tEnd = System.nanoTime();
        System.out.println("\n\nArrayLists vs LinkedLists\n ArrayList Creation:" + (tEnd - tBeg));

        tBeg = System.nanoTime();
        test6.arrayListCreation();
        tEnd = System.nanoTime();
        System.out.println(" LinkedList Creation:" + (tEnd - tBeg));

        tBeg = System.nanoTime();
        test6.arrayListAccess();
        tEnd = System.nanoTime();
        System.out.println(" ArrayList Access:" + (tEnd - tBeg));

        tBeg = System.nanoTime();
        test6.arrayListAccess();
        tEnd = System.nanoTime();
        System.out.println(" LinkedList Access:" + (tEnd - tBeg));

        StringOperations test7 = new StringOperations();
        tBeg = System.nanoTime();
        test7.usingPlus();
        tEnd = System.nanoTime();
        System.out.println("\n\nString Operations\n Using + :" + (tEnd - tBeg));

        tBeg = System.nanoTime();
        test7.usingStringBuffer();
        tEnd = System.nanoTime();
        System.out.println(" Using StringBuffer :" + (tEnd - tBeg));*/

        System.out.println("\n\nTests complete, end of program");
        
    }
    
}
