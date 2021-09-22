package Practice_3;

public class Employee {
    String name;
    String Add;
    int year_of_joining;
    public void display(){
        System.out.println(name+"          "+year_of_joining);
        System.out.println(Add);
    }
}
class EmployeeDetails{
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        emp1.name = "Aman";
        emp1.Add = "Chandigarh";
        emp1.year_of_joining = 2021;
        emp2.name = "Sunil";
        emp2.year_of_joining = 2000;
        emp2.Add = "Mathura";
        emp3.name = "Rohan";
        emp3.Add = "Agra";
        emp3.year_of_joining = 2010;
        System.out.println("Name          Year of");
        System.out.println("joining       Address");
        emp1.display();
        emp2.display();
        emp3.display();
    }
}
