package Practice_6;

import java.util.Scanner;

public class Student {
    String name;
    float percentage;

    public Student(String name, float percentage) {
        this.name = name;
        this.percentage = percentage;
    }
    public static void display(String n,float p){
        System.out.println("name:"+n+"  percentage:"+p);
    }
}
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student arr[] = new Student[3];
        float per =-1;
        int d=0;
        for (int i = 0; i < 3; i++) {
            arr[i] = new Student(sc.next(),sc.nextFloat());
            if(per<arr[i].percentage){
                per = arr[i].percentage;
                d = i;
            }
        }
        Student.display(arr[d].name,arr[d].percentage);
    }

}
