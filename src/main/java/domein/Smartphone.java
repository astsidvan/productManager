package domein;
public class Smartphone extends Product{

    protected String manufacturer;

    public Smartphone(int id, String name, int prise, String manufacturer) {
        super(id, name, prise);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

}
