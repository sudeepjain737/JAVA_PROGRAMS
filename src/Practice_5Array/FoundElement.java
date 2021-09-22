package Practice_5Array;
import java.util.Scanner;

public class FoundElement {
    static int arr[];
    static  int n;
    FoundElement(){
        Scanner input = new Scanner(System.in);
        arr = new int[5];
        System.out.print("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the number you want to found:");
        n = input.nextInt();
    }
    public static void displayElement(){
        int s=0;
        for (int i = 0; i < FoundElement.arr.length; i++) {
            if (FoundElement.arr[i] == FoundElement.n) {
                s = 1;
                System.out.println(i);
                break;
            }
        }
        if(s==0){
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        FoundElement f1 = new FoundElement();
        displayElement();
    }
}
