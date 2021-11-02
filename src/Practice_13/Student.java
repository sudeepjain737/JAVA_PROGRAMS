package Practice_13;

abstract public class Student {
    String name;
    int age;
    String program;

    public Student(String name, int age, String program) {
        this.name = name;
        this.age = age;
        this.program = program;
    }
    abstract public void display_student_info();

    public static void main(String[] args) {
        Graduate_Student g1 = new Graduate_Student("Sudeep Jain",20,"B.Tech","Science",95.80f);
        g1.display_student_info();
        Research_Student r1 = new Research_Student("Sudeep Jain",20,"B.Tech","AIML",2);
        r1.display_student_info();
    }
}
class Graduate_Student extends Student{
    String stream;
    float percentage;

    public Graduate_Student(String name, int age, String program, String stream, float percentage) {
        super(name, age, program);
        this.stream = stream;
        this.percentage = percentage;
    }
    public void display_student_info(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Program: " + program);
        System.out.println("Stream: " + stream);
        System.out.println("Percentage: " + percentage);
    }
}
class Research_Student extends Student{
    String specialization;
    int year_of_experience;

    public Research_Student(String name, int age, String program, String specialization, int year_of_experience) {
        super(name, age, program);
        this.specialization = specialization;
        this.year_of_experience = year_of_experience;
    }
    public void display_student_info(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Program: " + program);
        System.out.println("Specialization: " + specialization);
        System.out.println("Year of Experience: " + year_of_experience);
    }
}