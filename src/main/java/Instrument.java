public abstract class Instrument {

    private String brand;
    private String colour;
    private double buyPrice;
    private double sellPrice;

    public Instrument(String brand, String colour, double buyPrice, double sellPrice) {
        this.brand = brand;
        this.colour = colour;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

}
