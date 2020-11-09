package Week5JavaHomework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Answer3IterateElements {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Python");
        list.add("Eclipse");
        list.add("PHP");
        list.add("Ruby");
        list.add("C++");

        Iterator i = list.iterator();
        System.out.println("Arraylist Elements are : ");

        while (i.hasNext()) {

            System.out.println(i.next());
        }

    }

}

