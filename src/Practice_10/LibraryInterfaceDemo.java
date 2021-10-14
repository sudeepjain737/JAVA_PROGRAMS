package Practice_10;
interface LibraryUser
{
    public void registerAccount();
    public void requestBook();
}
class KidUsers implements LibraryUser
{
    private int age;
    private String bookType;

    public void setAge(int age) {
        this.age = age;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public void registerAccount(){
        if(age<12){
            System.out.println("You have successfully registered under a Kids Account");
        }
        else{
            System.out.println("Sorry,Age must be less than 12 to resister as a kid");
        }
    }
    public void requestBook(){
        if(bookType.equals("Kids")){
            System.out.println("Book issued successfully,please return within 10 days");
        }
        else{
            System.out.println("Oops,you are allowed to take only kids books");
        }
    }
}
class AdultUser implements LibraryUser
{
    private int age;
    private String bookType;

    public void setAge(int age) {
        this.age = age;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
    public void registerAccount(){
        if(age>12){
            System.out.println("You have successfully registered under an Adult Account");
        }
        else{
            System.out.println("Sorry,Age must be greater than 12 to resister as an adult");
        }
    }
    public void requestBook(){
        if(bookType.equals("Fiction")){
            System.out.println("Book issued successfully,please return within 7 days");
        }
        else{
            System.out.println("Oops,you are allowed to take only Fiction books");
        }
    }
}
public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUsers k1 = new KidUsers();
        KidUsers k2 = new KidUsers();
        k1.setAge(10);
        k2.setAge(18);
        k1.setBookType("Kids");
        k2.setBookType("Kids");
        k1.registerAccount();
        k1.requestBook();
        System.out.println();
        k2.registerAccount();
        k2.requestBook();
        AdultUser a1 = new AdultUser();
        AdultUser a2 = new AdultUser();
        a1.setAge(5);
        a2.setAge(23);
        a1.setBookType("Kids");
        a2.setBookType("Fiction");
        System.out.println();
        a1.registerAccount();
        a1.requestBook();
        System.out.println();
        a2.registerAccount();
        a2.requestBook();
    }
}
