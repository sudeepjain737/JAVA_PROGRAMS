package Practice_7;

public abstract class Compartment {
    public abstract String notice();
}
class FirstClass extends Compartment{

    @Override
    public String notice() {
        String s = "First Class Compartment";
        return s;
    }
}
class Ladies extends Compartment{

    @Override
    public String notice() {
        String s = "Ladies Compartment";
        return s;
    }
}
class General extends Compartment{

    @Override
    public String notice() {
        String s = "General Compartment";
        return s;
    }
}
class Luggage extends Compartment{

    @Override
    public String notice() {
        String s = "Luggage Compartment";
        return s;
    }
}
class CompartmentTest {
    public static void main(String[] args) {
        Compartment arr[] = new Compartment[10];
        for (int i = 0; i < arr.length; i++) {

            double k = Math.random()*4;
            int j = (int) k;
            if (j == 0) {
                arr[i] = new FirstClass();
                System.out.println(arr[i].notice());
            }
            else if (j == 1) {
                arr[i] = new Ladies();
                System.out.println(arr[i].notice());
            }
            else if (j == 2) {
                arr[i] = new General();
                System.out.println(arr[i].notice());
            }
            else if (j == 3) {
                arr[i] = new Luggage();
                System.out.println(arr[i].notice());
            }
        }
    }
}


