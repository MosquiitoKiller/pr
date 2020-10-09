package pr7;

public class Cupboard extends Furniture {

    Cupboard(int weight, int height, int length, int price) {
        super(weight, height, length, price);
    }

    @Override
    public String getType() {
        return "Cupboard";
    }

}
