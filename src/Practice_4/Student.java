package Practice_4;

public class Student {
    String name;
    public void studentDisplay(String s){
        name=s;
        System.out.println(name);
    }
    public void studentDisplay(){
        name = "Unkown";
        System.out.println(name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.studentDisplay("Roman reigns");
        s2.studentDisplay();
        s3.name = "John cena";
        s3.studentDisplay(s3.name);
    }
}
