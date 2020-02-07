public class DrumKit extends Instrument implements IPlay, ISell {

    private double buyPrice;
    private double sellPrice;
    private int noOfPieces;
    private String cymbalBrand;

    public DrumKit(String brand, String model, String colour, double buyPrice, double sellPrice, int noOfPieces, String cymbalBrand) {
        super(brand, model, colour);
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.noOfPieces = noOfPieces;
        this.cymbalBrand = cymbalBrand;
    }

    public int getNoOfPieces() {
        return this.noOfPieces;
    }

    public String getCymbalBrand() {
        return this.cymbalBrand;
    }

    public String play() {
        return "Ba dum tss";
    }

    public double getBuyPrice() {
        return this.buyPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

    public void setSellPrice(double newSellPrice) {
        this.sellPrice = newSellPrice;
    }

    public double calculateMarkup() {
        double markup = sellPrice - buyPrice;
        return markup;
    }

}
