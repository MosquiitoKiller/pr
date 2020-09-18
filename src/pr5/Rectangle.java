package pr5;

public class Rectangle extends Shape{
    double a,b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    void CalcArea() {
        area=a*b;
        System.out.println("area = a * b = "+a+" * "+b+" = "+area);
    }
}
