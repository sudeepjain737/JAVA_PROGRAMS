package Collection_Framework.ArrayList;

//Q. Write a Java program to remove the element at any index from a array list

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveElement {
    public void remove(ArrayList<Integer>arr,int index){
        if(index >= arr.size()){
            System.out.println("Can't Remove");
        }
        else{
            arr.remove(index);
            System.out.println("Successful");
        }
    }
    public static void main(String[] args) {
        RemoveElement r1 = new RemoveElement();
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr.add(input.nextInt());
        }
        r1.remove(arr,0);
        r1.remove(arr,10);
        r1.remove(arr,2);
        for (Integer var:arr
             ) {
            System.out.println(var);
        }
    }
}
