package designPatterns.builder;

public class Pizza {

    private String name;
    private String topping;
    private String product;
    private int diameter;
    private boolean isSpicy;
    private boolean hasMeat;

    public Pizza() {

    }

    public Pizza withName(String name) {
        this.name = name;
        return this;
    }

    public Pizza withTopping(String topping) {
        this.topping = topping;
        return this;
    }

    public Pizza withProduct(String product) {
        this.product = product;
        return this;
    }

    public Pizza withDiameter(int diameter) {
        this.diameter = diameter;
        return this;
    }

    public Pizza isSpicy(String answer) {
        answer = answer.toLowerCase();
        this.isSpicy = answer.equals("yes");
        return this;
    }

    public Pizza hasMeat(String answer) {
        answer = answer.toLowerCase();
        this.hasMeat = answer.equals("yes");
        return this;
    }

    public String getName() {
        return name;
    }

    public String getTopping() {
        return topping;
    }

    public String getProduct() {
        return product;
    }

    public int getDiameter() {
        return diameter;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public boolean hasMeat() {
        return hasMeat;
    }

    @Override
    public String toString() {
        return String.format("%s %s with %s, %s, %s %dcm.", isSpicy(this.isSpicy),name, topping, product, hasMeat(this.hasMeat),diameter);
    }

    private String isSpicy(boolean isSpicy) {
        return isSpicy ? "Spicy" : "Sweet";
    }

    private String hasMeat(boolean hasMeat) {
        return hasMeat ? "with meat" : "without meat";
    }
}
