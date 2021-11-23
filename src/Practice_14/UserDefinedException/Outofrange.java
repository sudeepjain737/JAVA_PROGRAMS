package Practice_14.UserDefinedException;

public class Outofrange extends Exception {
    Outofrange(){
        super();
        System.out.println("ValuesOutOfRangeException");
    }
}
