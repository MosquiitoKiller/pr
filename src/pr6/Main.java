package pr6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MovableRectangle movableRectangle=new MovableRectangle(3,9);
        Scanner scanner=new Scanner(System.in);
        movableRectangle.move(scanner.nextInt(), scanner.nextInt());
        System.out.println(movableRectangle.check_speed());
    }
}
