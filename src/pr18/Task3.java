package pr18;

import java.util.Scanner;

public class Task3 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(maxValue());
    }
    private static int maxValue(){
        int a=scanner.nextInt();
        if(a==0) return Integer.MIN_VALUE;
        else return Math.max(a, maxValue());
    }
}
