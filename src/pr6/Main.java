package pr6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MovableRectangle movableRectangle=new MovableRectangle(3,9);
        Scanner scanner=new Scanner(System.in);
        System.out.print("x_move_left=");
        int x_move=scanner.nextInt();
        System.out.print("y_move_left=");
        int y_move=scanner.nextInt();
        movableRectangle.move(x_move, y_move, movableRectangle.left);
        System.out.print("x_move_right=");
        x_move=scanner.nextInt();
        System.out.print("y_move_right=");
        y_move=scanner.nextInt();
        movableRectangle.move(x_move, y_move,movableRectangle.right);
        System.out.println(movableRectangle.checkSpeed());
    }
}
