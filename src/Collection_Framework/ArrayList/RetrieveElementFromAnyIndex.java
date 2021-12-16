package Collection_Framework.ArrayList;

//Q. Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.ArrayList;
import java.util.Scanner;

public class RetrieveElementFromAnyIndex {
    public void retrieveElement(ArrayList<Integer> arr,int index){
        if(index < arr.size()){
            System.out.println(arr.get(index));
        }
        else{
            System.out.println("Index > Size, so can't fetch element");
        }
    }

    public static void main(String[] args) {
        RetrieveElementFromAnyIndex r1 = new RetrieveElementFromAnyIndex();
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(input.nextInt());
        }
        r1.retrieveElement(arr,0);
        r1.retrieveElement(arr,5);
        r1.retrieveElement(arr,4);
        r1.retrieveElement(arr,2);
    }
}
