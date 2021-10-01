package Practice_6;

import java.util.Scanner;

public class Car {
    int manufacturer_year;
    int price;
    Car(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter manufacturer year of the car:");
        manufacturer_year = input.nextInt();
        System.out.print("Enter price of the car:");
        price = input.nextInt();
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        if(c1.price < c2.price && c1.price < c3.price ) {
            System.out.println("manufacturer year:" + c1.manufacturer_year + " price:" + c1.price);

            if (c2.price < c3.price) {
                System.out.println("manufacturer year:" + c2.manufacturer_year + " price:" + c2.price);
                System.out.println("manufacturer year:" + c3.manufacturer_year + " price:" + c3.price);
            }
            else {
                System.out.println("manufacturer year:" + c3.manufacturer_year + " price:" + c3.price);
                System.out.println("manufacturer year:" + c2.manufacturer_year + " price:" + c2.price);
            }
        }
        else if(c2.price < c1.price && c2.price < c3.price ) {
            System.out.println("manufacturer year:" + c2.manufacturer_year + " price:" + c2.price);

            if (c1.price < c3.price) {
                System.out.println("manufacturer year:" + c1.manufacturer_year + " price:" + c1.price);
                System.out.println("manufacturer year:" + c3.manufacturer_year + " price:" + c3.price);
            }
            else {
                System.out.println("manufacturer year:" + c3.manufacturer_year + " price:" + c3.price);
                System.out.println("manufacturer year:" + c1.manufacturer_year + " price:" + c1.price);
            }
        }
        else if(c3.price < c2.price && c3.price < c1.price ) {
            System.out.println("manufacturer year:" + c3.manufacturer_year + " price:" + c3.price);

            if (c2.price < c1.price) {
                System.out.println("manufacturer year:" + c2.manufacturer_year + " price:" + c2.price);
                System.out.println("manufacturer year:" + c1.manufacturer_year + " price:" + c1.price);
            }
            else {
                System.out.println("manufacturer year:" + c1.manufacturer_year + " price:" + c1.price);
                System.out.println("manufacturer year:" + c2.manufacturer_year + " price:" + c2.price);
            }
        }
    }
}
