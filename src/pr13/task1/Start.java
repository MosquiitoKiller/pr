package pr13.task1;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Сколько студентов?");
        int n=scanner.nextInt();
        TestClass testClass=new TestClass(n);
        testClass.sort_id();
        testClass.out_id();
    }
}