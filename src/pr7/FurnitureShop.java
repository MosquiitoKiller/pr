package pr7;

import java.util.Random;
import java.util.Scanner;

public class FurnitureShop {
    static void add(Person person){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        System.out.println("какую мебель хотите приобрести?\n\t1\tКамод\n\t2\tДиван\n\t3\tСтол");
        switch (scanner.nextInt()){
            case 1:
                person.basket.add(new Cupboard(random.nextInt(200),random.nextInt(250),random.nextInt(200),random.nextInt(200000)));
                break;
            case 2:
                person.basket.add(new Sofa(random.nextInt(250),random.nextInt(100),random.nextInt(250),random.nextInt(200000)));
                break;
            case 3:
                person.basket.add(new Table(random.nextInt(200),random.nextInt(100),random.nextInt(200),random.nextInt(100000)));
                break;
            default:
                System.out.println("Данного товара нет в наличии");
                break;
        }
    }
    static int get_price(Person person){
        int sum=0;
        for (Furniture q: person.basket) {
            sum+=q.getPrice();
        }
        return sum;
    }
}
