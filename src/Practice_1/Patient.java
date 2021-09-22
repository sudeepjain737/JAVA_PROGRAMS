package Practice_1;

import java.util.Scanner;

public class Patient {
    static double BMI(double height,double weight){
        double bmi = (weight*1000)/(height*height);
        return bmi;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter patient name: ");
        String patient_name = input.nextLine();
        System.out.print("Enter patient height(in meters only): ");
        double Height  = input.nextDouble();
        System.out.print("Enter patient weight(in Kg only): ");
        double Weight  = input.nextDouble();
        double Bmi = BMI(Height,Weight);
        System.out.println("Patient name is :"+patient_name);
        System.out.println("Height = "+Height);
        System.out.println("Weight ="+Weight);
        System.out.println("BMI = "+Bmi);
    }
}
