package pr10.task2;

import java.util.Scanner;

public class Main {
    public static int f(int a, int b) {
        if (a > b + 1)return 0;
        if (a == 0 || b == 0) return 1;
        return f(a, b - 1) + f(a - 1, b - 1);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(f(scanner.nextInt(), scanner.nextInt()));
    }
}
