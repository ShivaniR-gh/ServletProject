package dto;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class CustomerDTO implements Serializable , Comparable<String> {
    private String name;
    private long mobno;
    private String flavour;
    private int qty;
    private String paymentMode;

    private CustomerDTO(){

    }
    public CustomerDTO(String name, long mobno, String flavour, int qty, String paymentMode){
        this.name=name;
        this.mobno=mobno;
        this.flavour = flavour;
        this.qty = qty;
        this.paymentMode = paymentMode;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CustomerDTO that = (CustomerDTO) o;
        return mobno == that.mobno && qty == that.qty && Objects.equals(name, that.name) && Objects.equals(flavour, that.flavour) && Objects.equals(paymentMode, that.paymentMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mobno, flavour, qty, paymentMode);
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "name='" + name + '\'' +
                ", mobno=" + mobno +
                ", flavour='" + flavour + '\'' +
                ", qty=" + qty +
                ", paymentMode='" + paymentMode + '\'' +
                '}';
    }

    @Override
    public int compareTo(String o) {
        return this.name.compareTo(o);
    }
}
