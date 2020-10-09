package pr7;

public abstract class Furniture {
    private final int weight, height, length;
    private int price;
    public Furniture(int weight, int height, int length, int price) {
        this.weight = weight;
        this.height = height;
        this.length = length;
        this.price = price;
    }

    public abstract String getType();

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }
}
