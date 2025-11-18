package dto;

import java.io.Serializable;

public class CafeteriaDTO implements Serializable, Comparable<CafeteriaDTO> {

    private String name;
    private String location;
    private String type;
    private String price;
    private String franchise;
    private String owner;
    private String gst;

    public CafeteriaDTO() {
        System.out.println("CafeteriaDTO object created");
    }

    public CafeteriaDTO(String name, String location, String type, String price,
                        String franchise, String owner, String gst) {
        this.name = name;
        this.location = location;
        this.type = type;
        this.price = price;
        this.franchise = franchise;
        this.owner = owner;
        this.gst = gst;
    }


    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getPrice() { return price; }
    public void setPrice(String price) { this.price = price; }

    public String getFranchise() { return franchise; }
    public void setFranchise(String franchise) { this.franchise = franchise; }

    public String getOwner() { return owner; }
    public void setOwner(String owner) { this.owner = owner; }

    public String getGst() { return gst; }
    public void setGst(String gst) { this.gst = gst; }


    @Override
    public String toString() {
        return "CafeteriaDTO{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                ", price='" + price + '\'' +
                ", franchise='" + franchise + '\'' +
                ", owner='" + owner + '\'' +
                ", gst='" + gst + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof CafeteriaDTO)) return false;
        CafeteriaDTO other = (CafeteriaDTO) obj;
        return this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public int compareTo(CafeteriaDTO other) {
        return this.name.compareTo(other.name);
    }
}
