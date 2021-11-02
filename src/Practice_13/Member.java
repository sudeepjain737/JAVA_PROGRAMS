package Practice_13;

public class Member {
    String name;
    int age;
    long phone_number;
    String address;
    float salary;

    Member(String name, int age, long phone_number, String address, float salary) {
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
        this.address = address;
        this.salary = salary;
    }
    public void printSalary(){
        System.out.println("Salary = " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Sudeep Jain",20,852961,"Deeg",100000,"AIML");
        e1.display();
        Manager m1 = new Manager("Sudeep Jain",20,852961,"Deeg",100000,"CSE");
        m1.display();
    }
}
class Employee extends Member{
    String specialization;

    public Employee(String name, int age, long phone_number, String address, float salary, String specialization) {
        super(name, age, phone_number, address, salary);
        this.specialization = specialization;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone number: " + phone_number);
        System.out.println("Address: " + address);
        printSalary();
        System.out.println("Specialization: " + specialization);
    }
}
class Manager extends Member{
    String department;

    public Manager(String name, int age, long phone_number, String address, float salary, String department) {
        super(name, age, phone_number, address, salary);
        this.department = department;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone number: " + phone_number);
        System.out.println("Address: " + address);
        printSalary();
        System.out.println("Department: " + department);
    }
}