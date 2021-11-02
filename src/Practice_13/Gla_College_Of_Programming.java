package Practice_13;

import java.util.Scanner;

public class Gla_College_Of_Programming {
    float total_fees;
    float deposit_fees;
    Gla_College_Of_Programming(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Total amount of fees:");
        total_fees = input.nextFloat();
        System.out.print("Please Enter Total diposited amount:");
        deposit_fees = input.nextFloat();
    }

    public void finalFees() {
        float discount = 0;
        if (deposit_fees >= total_fees / 2) {
            discount = (0.05f * total_fees);
        }
        total_fees = total_fees + (0.1f * total_fees) + (0.05f * total_fees) - discount - deposit_fees;
        System.out.println("Final Fees to be paid = " + total_fees);
    }

    public static void main(String[] args) {
        while(true){
            Gla_College_Of_Programming g1 = new Gla_College_Of_Programming();
            if(g1.deposit_fees >= 10000 && g1.total_fees >=50000){
                g1.finalFees();
                break;
            }
            else{
                if(g1.total_fees >= 50000 && g1.deposit_fees <= 10000){
                    System.out.println("Please Enter correct Deposited fees");
                }
                else if(g1.total_fees <= 50000 && g1.deposit_fees >= 10000){
                    System.out.println("Please Enter correct Total fees");
                }
                else{
                    System.out.println("Please Enter correct Total fees");
                    System.out.println("Please Enter correct Deposited fees");
                }
            }
        }
    }
}
