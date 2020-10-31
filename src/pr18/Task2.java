package pr18;

import java.util.Scanner;

public class Task2 {
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) return true;
        else return str.toCharArray()[0] == str.toCharArray()[str.length() - 1] && isPalindrome(str.substring(1, str.length() - 1));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (isPalindrome(scanner.nextLine())) System.out.println("YES");
        else System.out.println("NO");
    }
}
