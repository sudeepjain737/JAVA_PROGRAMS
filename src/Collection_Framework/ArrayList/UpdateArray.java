package Collection_Framework.ArrayList;

//Q.  Write a Java program to update specific array element by given element.

import java.util.ArrayList;
import java.util.Scanner;

public class UpdateArray {
    public void updateArray(ArrayList<Integer>arr,int index,int element){
        if(index < arr.size()){
            arr.set(index,element);
            System.out.println("Successful");
        }
        else{
            System.out.println("Can't Perform");
        }
    }
    public static void main(String[] args) {
        UpdateArray u1 = new UpdateArray();
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(input.nextInt());
        }
        u1.updateArray(arr,0,6);
        u1.updateArray(arr,4,10);
        u1.updateArray(arr,2,20);
        u1.updateArray(arr,10,10);
        for (Integer var: arr
             ) {
            System.out.println(var);
        }
    }
}
