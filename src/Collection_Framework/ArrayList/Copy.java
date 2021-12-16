package Collection_Framework.ArrayList;

//Q. Write a Java program to copy one array list into another.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Copy {
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>();
        ArrayList<Integer>arr1 = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Entries For Array-1: ");
        for (int i = 0; i < 5; i++) {
            arr.add(input.nextInt());
        }
        System.out.print("Entries For Array-2: ");
        for (int i = 0; i < 5; i++) {
            arr1.add(input.nextInt());
        }
        System.out.print("Array-1: ");
        System.out.println(arr);
        System.out.print("Array-2: ");
        System.out.println(arr1);
        System.out.println("Copying Array-2 From Array-1");
        Collections.copy(arr1,arr);
        System.out.print("Array-1 after copy function: ");
        System.out.println(arr);
        System.out.print("Array-2 after copy function: ");
        System.out.println(arr1);
    }
}
