public class Guitar extends Instrument implements IPlay, ISell {

    private double buyPrice;
    private double sellPrice;
    private int noOfStrings;
    private String pickups;

    public Guitar(String brand, String model, String colour, double buyPrice, double sellPrice, int noOfStrings, String pickups) {
        super(brand, model, colour);
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.noOfStrings = noOfStrings;
        this.pickups = pickups;
    }

    public int getNoOfStrings() {
        return this.noOfStrings;
    }

    public String getPickups() {
        return this.pickups;
    }

    public String play() {
        return "Meedly meedly meedly";
    }

    public double getBuyPrice() {
        return this.buyPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

    public void setSellPrice(int newSellPrice) {
        this.sellPrice = newSellPrice;
    }

    public double calculateMarkup() {
        double markup = sellPrice - buyPrice;
        return markup;
    }

}
