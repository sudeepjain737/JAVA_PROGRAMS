package Practice_6;

public class AddAmount {
    public int amount;
    {
        amount = 50;
    }
    AddAmount(){
        amount = 50;
    }
    AddAmount(int a) {
        amount = amount + a;
    }
    public void display(){
        System.out.println(amount);
    }

    public static void main(String[] args) {;
        AddAmount obj1 = new AddAmount(100);
        AddAmount obj2 = new AddAmount();
        obj1.display();
        obj2.display();
    }
}
