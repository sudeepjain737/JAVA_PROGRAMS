package Collection_Framework.ArrayList;

//Q. Write a Java program to shuffle elements in a array list.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ShufflingArray {
    public void shuffle(ArrayList<Integer>arr){
        Collections.shuffle(arr);
    }
    public static void main(String[] args) {
        ShufflingArray s1 = new ShufflingArray();
        ArrayList<Integer>arr = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr.add(input.nextInt());
        }
        System.out.print("Array Before Shuffling-->");
        System.out.println(arr);
        s1.shuffle(arr);
        System.out.print("Array After Shuffling-->");
        System.out.println(arr);
    }
}
