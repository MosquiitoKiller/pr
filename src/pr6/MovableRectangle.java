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
        System.out.print("x_left=");
        left.x=scanner.nextInt();
        System.out.print("y_left=");
        left.y=scanner.nextInt();
        System.out.print("x_right=");
        right.x=scanner.nextInt();
        System.out.print("y_right=");
        right.y=scanner.nextInt();
        reassign(left);
        reassign(right);
    }
    private void reassign(MovablePoint mp){
        mp.lastx=mp.x;
        mp.lasty=mp.y;
    }
    @Override
    public void move(int x,int y,MovablePoint mp) {
        reassign(mp);
        mp.x+=x;
        mp.y+=y;
    }

    @Override
    public boolean checkSpeed() {
        return left.x-left.lastx==right.x-right.lastx && left.y-left.lasty==right.y-right.lasty;
    }
}
