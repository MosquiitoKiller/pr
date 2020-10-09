package pr7;

public class Table extends Furniture{

    public Table(int weight, int height, int length, int price) {
        super(weight, height, length, price);
    }

    @Override
    public String getType() {
        return "Table";
    }
}
