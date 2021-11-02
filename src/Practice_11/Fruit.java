package Practice_11;

public class Fruit {
    String name;
    String taste;
    int size;
    Fruit(){
        name = "Unknown";
        taste = "Tasteless";
        size = 0;
    }
    public void eat(){
        System.out.println("Fruit name: " + name + "  " + "Taste: " + taste);
    }

    public static void main(String[] args) {
        Fruit f1 = new Fruit();
        Fruit f2 = new Apple();
        Fruit f3 = new Orange();
        f1.eat();
        f2.eat();
        f3.eat();
    }
}

class Apple extends Fruit{
    public void eat(){
        System.out.println("It tastes like an apple");
    }
}

class Orange extends Fruit{
    public void eat(){
        System.out.println("It tastes like an orange");
    }
}