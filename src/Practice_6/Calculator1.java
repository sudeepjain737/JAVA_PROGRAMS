package Practice_6;

public class Calculator1 {
    static int powerInt(int num1, int num2){

        return (int) Math.pow(num1,num2);
    }
    static double powerdouble(double num1,int num2){

        return Math.pow(num1,num2);
    }
}
class Answer{
    public static void main(String[] args) {

        System.out.println(Calculator1.powerInt(20,3));

        System.out.println(Calculator1.powerdouble(20.5,3));

        System.out.println(Calculator1.powerdouble(20.0,3));
    }
}
