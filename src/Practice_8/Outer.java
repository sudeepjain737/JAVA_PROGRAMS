package Practice_8;

public class Outer {
    public void display(){
        System.out.println("Hemllo");
    }
    class Inner{
        public void display(){
            System.out.println("Bye");
        }
    }
    public void m1(){
        Inner i1 = new Inner();
        i1.display();
    }
}
class Result{
    public static void main(String[] args) {
        Outer obj1 = new Outer();
        obj1.display();
        obj1.m1();
    }

}
