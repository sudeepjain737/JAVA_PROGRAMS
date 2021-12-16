package Collection_Framework.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SortingArray {
    public void sort(ArrayList<Integer>arr){
        Collections.sort(arr);
    }
    public static void main(String[] args) {
        SortingArray s1 = new SortingArray();
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr.add(input.nextInt());
        }
        System.out.println("Array before Sorting-->");
        System.out.println(arr);
        s1.sort(arr);
        System.out.println("Array after Sorting-->");
        System.out.println(arr);
    }
}
