package Practice_6;

import java.util.Scanner;

public class BooleanSearch {
    int arr[] = new int[]{10, 20, 30, 40, 50};

    public boolean search(int n) {
        int c = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i] == n) {
                c = 1;
                break;
            }
        }
        if(c == 1){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        BooleanSearch b1 = new BooleanSearch();
        System.out.print("Enter a number you want to found:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(b1.search(n) == true){
            System.out.println(b1.search(n));
        }
        else{
            System.out.println("Element not found");
        }
    }
}
