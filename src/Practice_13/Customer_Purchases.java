package Practice_13;

import javax.sound.midi.Soundbank;

public class Customer_Purchases {
    private long number;
    private String first_name;
    private String surname;
    private String product;
    private float price;
    private int quantity;

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        Printing p1 = new Printing();
        p1.setNumber(1234);
        p1.setFirst_name("Sudeep");
        p1.setSurname("Jain");
        p1.setProduct("Mobile Phone");
        p1.setQuantity(10);
        p1.setPrice(20000);
        p1.Customer_Purchase_Report();
        p1.printDetails();
    }
}
class Printing extends Customer_Purchases {
    public void printDetails() {
        System.out.println("Customer Number: " + getNumber());
        System.out.println("Name: " + getFirst_name() + " " + getSurname());
        System.out.println("Product: " + getProduct());
        System.out.println("Price: " + getPrice());
        System.out.println("Quantity: " + getQuantity());
        float total_bill = getQuantity()*(getPrice() + 0.15f * getPrice() - 0.085f * getPrice() - 0.01f * getPrice());
        System.out.println("Total bill is: " + total_bill);
    }

    public void Customer_Purchase_Report() {
        System.out.println("Customer Purchase Report");
        System.out.println("TAX 15%\n" +
                "COMMISSION 8.5%\n" +
                "DISCOUNT 10%");
        float res = getPrice() + 0.15f * getPrice() - 0.085f * getPrice() - 0.01f * getPrice();
        System.out.println("TOTAL: " + res);
    }
}
