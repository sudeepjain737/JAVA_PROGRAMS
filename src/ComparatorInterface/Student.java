package ComparatorInterface;

import java.util.*;
public class Student {
    int rollno;
    int age;
    String name;

    Student(String name,int rollno, int age) {
        this.rollno = rollno;
        this.age = age;
        this.name = name;
    }
    public void display(){
        System.out.println("Name: " + name + "  Age: " + age + "  Roll No.: " + rollno);
    }
}


class SortByName implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}
class SortByAge implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.age - s2.age;
    }
}
class SortByRollNo implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.rollno - s2.rollno;
    }
}

class Result {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        ArrayList<Student> stu = new ArrayList<Student>();
        stu.add(new Student("Sudeep Jain",64,20));
        stu.add(new Student("Rishabh Tiwari",58,24));
        stu.add(new Student("Raghav Gupta",55,19));
        stu.add(new Student("Raghav Mittal",50,19));
        stu.add(new Student("Rahul pathak",48,18));

        System.out.println("Without Sorting-->");
        for (int i = 0; i < stu.size(); i++) {
            stu.get(i).display();
        }
        System.out.println();
        System.out.println("Sorting with Name-->");
        Collections.sort(stu , new SortByName());
        for (int i = 0; i < stu.size(); i++) {
            stu.get(i).display();
        }
        System.out.println();
        System.out.println("Sorting with Age-->");
        Collections.sort(stu , new SortByAge());
        for (int i = 0; i < stu.size(); i++) {
            stu.get(i).display();
        }
        System.out.println();
        Collections.sort(stu , new SortByRollNo());
        System.out.println("Sorting with Roll No.-->");
        for (int i = 0; i < stu.size(); i++) {
            stu.get(i).display();
        }
    }
}

