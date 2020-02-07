public abstract class Instrument {

    private String brand;
    private String model;
    private String colour;
    private double buyPrice;
    private double sellPrice;

    public Instrument(String brand, String model, String colour, double buyPrice, double sellPrice) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public String getColour() {
        return this.colour;
    }

    public double getBuyPrice() {
        return this.buyPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }
}
