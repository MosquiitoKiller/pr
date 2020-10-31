package pr18;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int min=a;
        while (a!=0){
            if(a<min) min=a;
            a=scanner.nextInt();
        }
        System.out.println(min);
    }
}
