package sub;

import java.util.ArrayList;
import java.util.LinkedList;
 
/**
 *
 * @author luigibenedicenti
 *
 * @modified kcyow March 14th 2019
 * 
*/
public class ArrayListvsLinkedList {
	
	//Refactoring 01: changing variable name
    /*private ArrayList<Integer> al = new ArrayList<Integer>();
    private LinkedList<Integer> ll = new LinkedList<Integer>();
    private static final int N = 100000; // 1000000*/
	
	//Refactoring 02: Slide statement(for duplicate lines of code)
	/*Defining Object o outside once instead declaring it twice inside two different
	 * functions
	 */
	Object o;
	
	private ArrayList<Integer> arrayl = new ArrayList<Integer>();
    private LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
    private static final int N = 100000;

    public void arrayListCreation() {
        for (int i = 1; i <= N; i++) {
            arrayl.add(0, new Integer(i));
        }
    }

    public void linkedListCreation() {
        for (int i = 1; i <= N; i++) {
            linkedList1.add(0, new Integer(i));
        }
    }

    public void arrayListAccess() {
        //Object o;
        for (int i = 0; i < N; i++) {
            o = arrayl.get(i);
        }
    }

    public void linkedListAccess() {
        //Object o;
        for (int i = 0; i < N; i++) {
            o = linkedList1.get(i);
        }
    }
}

