package pr10.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        f(scanner.nextInt());
    }
    public static void f(int a){
        if(a!=0) {
            f(a / 10);
            System.out.println(a % 10);
        }
    }
}
