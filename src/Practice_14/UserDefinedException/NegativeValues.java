package Practice_14.UserDefinedException;

public class NegativeValues extends Exception{
    NegativeValues(){
        super();
        System.out.println("NegativeValuesException");
    }
}
