public class Guitar extends Instrument implements IPlay {

    private int noOfStrings;
    private String pickups;

    public Guitar(String brand, String model, String colour, double buyPrice, double sellPrice, int noOfStrings, String pickups) {
        super(brand, model, colour, buyPrice, sellPrice);
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

}
