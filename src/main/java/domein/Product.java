package domein;
public class Product {

    protected int id;
    protected String name;
    protected int prise;

    public Product( int id, String name,int prise){
        this.id = id;
        this.name = name;
        this.prise = prise;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

}