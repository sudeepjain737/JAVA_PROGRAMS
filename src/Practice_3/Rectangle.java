package Practice_3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Rectangle {
    int length;
    int breadth;
    Rectangle(int a ,int b) {
        length = a;
        breadth = b;
    }
    void display(){
        System.out.println(length*breadth);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int l1,l2,b1,b2;
        l1=input.nextInt();
        b1=input.nextInt();
        l2=input.nextInt();
        b2=input.nextInt();
        Rectangle r1 = new Rectangle(l1,b1);
        Rectangle r2 = new Rectangle(l2,b2);
        r1.display();
        r2.display();

    }
}
