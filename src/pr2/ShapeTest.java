package pr2;

public class ShapeTest {
    public static void main(String[] args) {
        Shape rect=new Shape("rect",25);
        Shape circle=new Shape("circle",65);
        System.out.println(rect.getType()+"="+rect.getS());
        System.out.println(circle.getType()+"="+circle.getS());
    }
}
