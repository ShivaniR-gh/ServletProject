package dto;

public class CoffeeLandDTO {
    private String acre;
    private int totalPlants;
    private int yields;
    private double expenditure;
    private String profitMode;
    private int qty;

    public CoffeeLandDTO(String acre, int totalPlants , int yields , double expenditure, String profitMode, int qty){
        this.acre =acre;
        this.totalPlants =totalPlants;
        this.yields= yields;
        this.expenditure=expenditure;
        this.profitMode=profitMode;
        this.qty=qty;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "CoffeeLand{" +
                "acre='" + acre + '\'' +
                ", totalPlants=" + totalPlants +
                ", yields=" + yields +
                ", expenditure=" + expenditure +
                ", profitMode='" + profitMode + '\'' +
                ", qty=" + qty +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

