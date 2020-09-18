package pr5;

public class Circle extends Shape{
    double rad;

    public Circle(double rad) {
        this.rad = rad;
    }

    @Override
    void CalcArea() {
        area=Math.PI*rad*rad;
        System.out.println("area = pi * r^2 = "+Math.PI+" * "+rad+"^2 = "+area);
    }
}
