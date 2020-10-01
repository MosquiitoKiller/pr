package pr7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Person person=new Person();
        System.out.println("сколько вещей с рандомными характеристиками хотите купить?");
        int c= scanner.nextInt();
        for(int i=0;i<c;++i) FurnitureShop.add(person);
        System.out.println("С вас "+FurnitureShop.get_price(person)+" рублей");
    }
}
