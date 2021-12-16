package Collection_Framework.ArrayList;

//Q. Write a Java program to insert an element into the array list at the first position.

import java.util.ArrayList;
import java.util.Scanner;

public class InsertAtAnyIndex {
    public void insertAtAnyIndex(ArrayList<Integer> arr, int index,int element){
        if(index < arr.size()) {
            arr.add(index, element);
        }
        else {
            System.out.println("Index > Size, so can't Insert element " + element + " on index: " + index);
        }
    }
    public static void main(String[] args) {
        InsertAtAnyIndex i1 = new InsertAtAnyIndex();
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(input.nextInt());
        }
        i1.insertAtAnyIndex(arr,0,6);
        i1.insertAtAnyIndex(arr,9,7);
        for (Integer var: arr
             ) {
            System.out.println(var);
        }
    }
}
