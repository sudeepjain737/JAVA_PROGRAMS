package Practice_14.AgeException;

public class ArgsException extends Throwable {
    ArgsException(){
        super();
        System.out.println("Number of arguments is invalid");
    }
}
