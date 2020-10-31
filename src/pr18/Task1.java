package pr18;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        outAllPrimeNumbers(scanner.nextInt(),2);
    }
    static void outAllPrimeNumbers(int n, int k) {
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % k != 0) outAllPrimeNumbers(n, ++k);
        else {
            System.out.println(k);
            outAllPrimeNumbers(n / k, k);
        }
    }
}
