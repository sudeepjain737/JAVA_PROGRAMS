package Collection_Framework.ArrayList;

//Q. Write a Java program to reverse elements in a array list.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer>arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(input.nextInt());
        }
        System.out.print("Array Before Reversing: ");
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.print("Array After Reversing: ");
        System.out.println(arr);
    }
}
