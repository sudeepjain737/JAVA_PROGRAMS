package WrapperClass;

public class NumberConversion {
    public static void main(String[] args) {
        System.out.println("Binary of the given number is: " + Integer.toBinaryString(Integer.parseInt(args[0])));
        System.out.println("Octal of the given number is: " + Integer.toOctalString(Integer.parseInt(args[0])));
        System.out.println("HexaDecimal of the given number is: " + Integer.toHexString(Integer.parseInt(args[0])));
    }
}
