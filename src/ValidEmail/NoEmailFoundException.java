package ValidEmail;

public class NoEmailFoundException extends Exception {
    NoEmailFoundException(){
        super();
        System.out.println("No Valid Email Address Found");
    }
}
