package Practice_11;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Sudeep Jain",20,100000,"Maths");
        t1.display();
        CollegeStudent c1 = new CollegeStudent("Sudeep Jain",20,2021,"Object oriented programming");
        c1.display();
    }
}

class Student extends Person{
    String collegeName;

    public Student(String name, int age) {
        super(name, age);
        this.collegeName = "GLA";
    }
}

class Teacher extends Person{
    float salary;
    String subject;

    Teacher(String name, int age, float salary, String subject) {
        super(name,age);
        this.salary = salary;
        this.subject = subject;
    }
    public void display(){
        System.out.println("Name: " + name + "  " + "Age: " + age);
        System.out.println("Salary: " + salary + "  " + "Subject: " + subject);
    }
}

class CollegeStudent extends Student{
    int year;
    String major;

    public CollegeStudent(String name, int age, int year, String major) {
        super(name, age);
        this.year = year;
        this.major = major;
    }
    public void display(){
        System.out.println("Name: " + name + "  " + "Age: " + age + "  " + "College name: " + collegeName);
        System.out.println("Year: " + year + "  " + "Major: " + major);
    }
}
