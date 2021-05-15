package sternback.cafe;

public abstract class Drink {
    private String description = "unknown drink";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double getPrice();
}
