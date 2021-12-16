package Collection_Framework.ArrayList;

// Q. Write a Java program to search an element in a array list

import java.util.ArrayList;
import java.util.Scanner;

public class SearchElement {
    public void search(ArrayList<Integer>arr,int element){
        if(arr.contains(element)){
            System.out.println("Found");
        }
        else {
            System.out.println("Element Not Found");
        }
    }
    public static void main(String[] args) {
        SearchElement s1 = new SearchElement();
        Scanner input = new Scanner(System.in);
        ArrayList<Integer>arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(input.nextInt());
        }
        s1.search(arr,2);
        s1.search(arr,10);
    }
}
