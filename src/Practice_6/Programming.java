package Practice_6;

public class Programming {
    String s;
    Programming(){
        s = "I love programming languages";
    }
    Programming(String s1){
        s = "I love "+s1;
    }
    public void display(){
        System.out.println(s);
    }

    public static void main(String[] args) {
        Programming p1 = new Programming();
        Programming p2 = new Programming("Java");
        p1.display();
        p2.display();
    }
}
