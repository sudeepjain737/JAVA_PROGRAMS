package Practice_14.UserDefinedException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Marks {
    public void avgMarks(){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            int n = i+1;
            int marks[] = new int[3];
            String name;
            try{
                System.out.print("Enter the name of Student " + n +" ");
                name = input.nextLine();
                System.out.print("Enter the Marks of Student " + n + " ");
                for (int j = 0; j < 3; j++) {
                    marks[j] = input.nextInt();
                    if(marks[j] < 0){
                        throw new NegativeValues();
                    }
                    if(marks[j] > 100 ){
                        throw new Outofrange();
                    }
                }
            }catch (InputMismatchException | NegativeValues | Outofrange obj){
                System.out.println(obj);
            }
            int s = 0;
            for (int j = 0; j < 3; j++) {
                s = s+marks[j];
            }
            System.out.println("Average Marks of Student " + n + " is " + s/3);
            input.nextLine();
        }
    }
    public static void main(String[] args) {
        Marks m1 = new Marks();
        m1.avgMarks();
    }
}
