package Practice_14.Registration;

public class UserRegistration {
    public void registerUser(String username,String userCountry){
        try {
            if(userCountry.equals("India") == false){
                throw new InvalidCountryException();
            }
            System.out.println("User registration done successfully");
        }catch (InvalidCountryException obj){
            System.out.println(obj);
        }

    }

    public static void main(String[] args) {
        UserRegistration u1 = new UserRegistration();
        u1.registerUser("Mickey","US");
        u1.registerUser("Mini","India");
    }
}
