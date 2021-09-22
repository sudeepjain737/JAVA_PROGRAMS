package Practice_3;

import java.util.Scanner;

public class EmployeeSalary {
    int Salary;
    int Number_of_hours;
    public void getInfo(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial Salary of Employee: ");
        Salary = input.nextInt();
        System.out.print("Enter No. of working hours of the Employee: ");
        Number_of_hours = input.nextInt();
     }
     public void Addsal() {
         if (Salary < 500) {
             Salary = Salary + 10;
         }
     }
     public void Addwork(){
        if(Number_of_hours>=6){
            Salary=Salary+5;
        }
         System.out.print("Final Salary of Employee :");
         System.out.println(Salary);
    }
    public static void main(String[] args) {
        EmployeeSalary E1 = new EmployeeSalary();
        E1.getInfo();
        E1.Addsal();
        E1.Addwork();
    }
}