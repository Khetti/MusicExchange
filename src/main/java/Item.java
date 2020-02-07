public class Item implements ISell {

    private String type;
    private double buyPrice;
    private double sellPrice;

    public Item(String type, double buyPrice, double sellPrice) {
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getType() {
        return this.type;
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
