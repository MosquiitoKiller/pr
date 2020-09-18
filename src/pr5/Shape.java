package pr5;

public abstract class Shape {
    double area;
    String color;
    abstract void CalcArea();
    void GetColorToBlack(){
        color="Black";
    }
}
