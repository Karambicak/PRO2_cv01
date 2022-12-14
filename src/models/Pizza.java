package models;

public class Pizza {
    private int price;
    private String name;
    private String description;

    public Pizza(int price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }



    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override //code > override methods
    public String toString() {
        return name+ " " +price;
    }
}
