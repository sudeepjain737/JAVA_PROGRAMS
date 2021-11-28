package Practice_15;

class Scooby extends Thread{
    Scooby(String s){
        super(s);
    }
    public void run(){};
}

class Shaggy extends Thread{
    Shaggy(String s){
        super(s);
    }
    public void run(){};
}
public class DisplayThreadName {
    public static void main(String[] args) {
        Scooby s1 = new Scooby("This is Scooby Thread");
        Shaggy s2 = new Shaggy("This is Shaggy Thread");

        System.out.println(s1.getName());
        System.out.println(s2.getName());
    }
}
