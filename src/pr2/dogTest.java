package pr2;

import java.util.ArrayList;
import java.util.Scanner;

public class dogTest {
    public static ArrayList<Dog> dogs=new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        add(3);
        for (Dog q:dogs) System.out.println(q.toString());
    }
    public static void add(int n){
        String name;
        int age;
        for(int i=0;i<n;++i){
            System.out.print("name=");
            name=scanner.next();
            System.out.print("age=");
            age=scanner.nextInt();
            dogs.add(new Dog(name,age));
        }
    }
}
