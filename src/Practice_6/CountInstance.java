package Practice_6;

public class CountInstance {
    static int count = 0;
    CountInstance(){
        count = count+1;
    }

    public static void main(String[] args) {
        CountInstance c1 = new CountInstance();
        CountInstance c2 = new CountInstance();
        CountInstance c3 = new CountInstance();
        System.out.print("Total number of instances:");
        System.out.println(CountInstance.count);
    }
}
