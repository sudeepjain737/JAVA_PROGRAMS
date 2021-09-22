package Practice_5Array;
import java.util.Scanner;

public class Element1Or4 {
    static int n;
    static int arr[];
    Element1Or4(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter length of array:");
            n = input.nextInt();
            arr = new int[n];
            System.out.print("Enter array Elements:");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = input.nextInt();
            }
    }
    public static void found1Or4(){
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 1 && arr[i] != 4){
                s = 1;
                break;
            }
        }
        if(s == 1){
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
    }

    public static void main(String[] args) {
        Element1Or4 e1 = new Element1Or4();
        found1Or4();
    }
}
