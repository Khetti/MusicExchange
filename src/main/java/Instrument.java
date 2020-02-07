public abstract class Instrument {

    private String brand;
    private String model;
    private String colour;


    public Instrument(String brand, String model, String colour) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;

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

}
