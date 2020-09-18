package pr6;

import pr5.Rectangle;

import java.util.Scanner;

public class MovableRectangle extends Rectangle implements Movable{
    MovablePoint left=new MovablePoint();
    MovablePoint right=new MovablePoint();
    Scanner scanner=new Scanner(System.in);
    public MovableRectangle(double a, double b) {
        super(a, b);
        input();
    }
    void input(){
        System.out.println("x_left=");
        left.x=scanner.nextInt();
        System.out.println("y_left=");
        left.y=scanner.nextInt();
        System.out.println("x_right=");
        right.x=scanner.nextInt();
        System.out.println("y_right=");
        right.y=scanner.nextInt();
        reassign();
    }
    void reassign(){
        left.lastx=left.x;
        left.lasty=left.y;
        right.lastx=right.x;
        right.lasty=right.y;
    }
    @Override
    public void move(int x,int y) {
        reassign();
        left.x+=x;
        left.y+=y;
        right.x+=x;
        right.y+=y;
    }

    @Override
    public boolean check_speed() {
        return left.x-left.lastx==right.x-right.lastx && left.y-left.lasty==right.y-right.lasty;
    }
}
