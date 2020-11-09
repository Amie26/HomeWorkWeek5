package Week5JavaHomework;
// Java program
import sun.awt.SunHints;

import java.util.ArrayList;
import java.util.Scanner;

public class Answer4RetreiveElement {
    static int value;
    static int ret;

    public static void main(String[] args) {
        System.out.println(" Enter your choice from 0 to 4 :");
        Scanner mySc = new Scanner(System.in);
        value = mySc.nextInt();
        colourName  (value);

    }

    public static void colourName(int ret) {

    // create an empty array list with an initial capacity
    ArrayList<String> color_list = new ArrayList<String>(5);

    // use add() method to add values in the list
    color_list.add("White");
    color_list.add("Black");
    color_list.add("Red");
    color_list.add("White");
	color_list.add("Yellow");
	String name = color_list.get(ret);
        System.out.println("The colour at given index is :" + name);
    }
}


