package Practice_5Array;

import java.util.Scanner;

public class ArraySum {
    static int n;
    static int arr[];
    ArraySum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of array:");
        n = input.nextInt();
        arr = new int[n];
        System.out.print("Enter array Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
    }
    public static void arraySum(){
        int s1 = -1;
        int s2 = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 6) {
                s1 = i;
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 7){
                s2 = i;
                break;
            }
        }
        int s = 0;
        if((s1 < 0) || (s2 < 0) || (s1>s2)){
            for (int i = 0; i < arr.length; i++) {
                s = s + arr[i];
            }
        }
        else{
            for (int i = 0; i < arr.length; i++) {
                if(i < s1 || i > s2){
                    s = s + arr[i];
                }
            }
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        ArraySum a1 = new ArraySum();
        arraySum();
    }
}
