package pr15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws VecException {
        Vector vector=new Vector();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Сколько элементов ввести?");
        int n=scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("\nelem #1 = ");
            vector.add(scanner.nextInt());
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector.findInd(i));
        }
        System.out.println("Индекс какого элемента хотите найти");
        System.out.println(vector.findVal(scanner.nextInt()));

    }
}
