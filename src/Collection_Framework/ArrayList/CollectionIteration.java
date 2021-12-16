package Collection_Framework.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

//Q. Write a Java program to iterate through all elements in a array list.
public class CollectionIteration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(input.nextInt());
        }
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.println(arr.get(i));
//        }
        for (Integer var:arr
             ) {
            System.out.println(var);
        }
    }
}
