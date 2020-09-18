package pr5;

public class Square extends Shape{
    double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    void CalcArea() {
        area=a*a;
        System.out.println("area = a * a = "+a+"^2 = "+area);
    }
}
