package Practice_14.Registration;

public class InvalidCountryException extends Throwable {
    InvalidCountryException(){
        super();
        System.out.println("User Outside India cannot be registered");
    }
}
