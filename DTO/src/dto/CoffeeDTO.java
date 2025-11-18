package dto;

import java.io.Serializable;
import java.util.Comparator;

public class CoffeeDTO implements Serializable , Comparable<String> {
    private String type;
    private double price;
    private int quantity;
    private String former;
    private String location;

    public CoffeeDTO(){
        System.out.println("object created");
    }


    public CoffeeDTO(String type, double price, int quantity, String former, String location){
        this.type = type;
        this.price = price;
        this.quantity = quantity;
        this.former = former;
        this.location = location;
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "CoffeeDTO{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", former='" + former + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(String o) {
        return this.former.compareTo(o);
    }
}
