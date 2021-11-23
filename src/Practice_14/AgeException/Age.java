package Practice_14.AgeException;
import Practice_14.UserDefinedException.Outofrange;
import java.util.InputMismatchException;

public class Age {

    public static void main(String[] args) {
        String name;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the name of the person: ");
//        name = input.nextLine();
        int age;
//        System.out.println("Enter the age of the person: ");
        try {
            if(args.length != 2){
                throw new ArgsException();
            }
            name = args[0];
//          age = input.nextInt();
            age = Integer.parseInt(args[1]);
            if (age < 18 || age > 60) {
                throw new AgeException();
            }
            System.out.println("Name: " + name + "Age: " + age);
        } catch (NumberFormatException | ArgsException | AgeException obj) {
            System.out.println(obj);
        }
    }
}
