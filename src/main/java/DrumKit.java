public class DrumKit extends Instrument implements IPlay {

    private int noOfPieces;
    private String cymbalBrand;

    public DrumKit(String brand, String model, String colour, double buyPrice, double sellPrice, int noOfPieces, String cymbalBrand) {
        super(brand, model, colour, buyPrice, sellPrice);
        this.noOfPieces = noOfPieces;
        this.cymbalBrand = cymbalBrand;
    }

    public String play() {
        return "Ba dum tss";
    }
}
