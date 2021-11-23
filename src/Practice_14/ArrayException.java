package Practice_14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayException {
    public void arrayException(){
        try{
            int n;
            System.out.println("Enter the number of elements in the array");
            Scanner input = new Scanner(System.in);
            n = input.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the elements of the array");
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            System.out.println("Enter the index of the array element you want to access");
            int m = input.nextInt();
            System.out.println("The array element at index " + m + " = " + arr[m] + "\n" + "The array element successfully accessed");
        }catch (InputMismatchException obj){
            System.out.println("java.lang.NumberFormatException");
        }
        catch (ArrayIndexOutOfBoundsException obj){
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        }
    }
    public static void main(String[] args) {
        ArrayException a1 = new ArrayException();
        a1.arrayException();
    }
}
