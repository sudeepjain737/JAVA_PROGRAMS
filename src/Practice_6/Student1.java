package Practice_6;

import java.util.Scanner;

public class Student1 {
    public static String name;
    public static int age;
    public static String address;

    public Student1() {
        name = "unknown";
        age = 0;
        address = "not available";
    }

    public static void setInfo(int a, String n) {
        age = a;
        name = n;
    }

    public static void setInfo(String n, int a, String add) {
        age = a;
        name = n;
        address = add;
    }

    public void display() {
        System.out.println("name:" + name + " age:" + age + " address:" + address);
    }


    public static void main(String[] args) {
        Student1 arr[] = new Student1[3];
        Scanner input = new Scanner(System.in);
        int age;
        int j=1;
        String name, address;
        for (int i = 0; i < 3; i++) {
            arr[i] = new Student1();
            System.out.println("Enter the details of Student-->" + j);
            j=j+1;
            System.out.print("Enter name:");
            name = input.nextLine();
            System.out.print("Enter age:");
            age = input.nextInt();
            System.out.print("Enter address:");
            input.nextLine();
            address = input.nextLine();
            arr[i].setInfo(name, age, address);
            //arr[i].display();
        }
        for (int i=0;i < 3; i++) {
            arr[i].display();
        }
    }
}
