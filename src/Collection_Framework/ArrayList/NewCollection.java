package Collection_Framework.ArrayList;

//Q. Write a Java program to create a new array list, add some colors (string) and print out the collection.

import java.util.ArrayList;

public class NewCollection {
    public static void main(String[] args) {
        ArrayList<String> arr  = new ArrayList<String>();
        arr.add("Red");
        arr.add("Blue");
        arr.add("Yellow");
        arr.add("White");
        arr.add("Black");
        arr.add("Purple");
        System.out.println(arr);
    }
}
