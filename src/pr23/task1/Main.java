package pr23.task1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1\tСтроки\n2\tЧисла");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        while (a!=1&&a!=2){
            System.out.println("ЛИБО 1 ЛИБО 2\nДРУГИХ ВАРИАНТОВ НЕТ(");
            a=scanner.nextInt();
        }
        int n;
        System.out.println("Кол-во элементов?");
        n=scanner.nextInt();
        switch (a){
            case 1:
                String[] mas =new String[n];
                System.out.println("Input:");
                for (int i = 0; i < mas.length; i++) mas[i]=scanner.next();
                LinkedList<String> stringLinkedList=convert(mas);
                outList(stringLinkedList);
                break;
            case 2:
                Integer[] masi =new Integer[n];
                System.out.println("input:");
                for (int i = 0; i < masi.length; i++) masi[i]=scanner.nextInt();
                LinkedList<Integer> linkedList= convert(masi);
                outList(linkedList);
                break;
        }


    }

    public static <E> LinkedList<E> convert(E[] mas){
        LinkedList<E> copy=new LinkedList<E>();
        for(int i=0;i<mas.length;++i) copy.add(mas[i]);
        return copy;
    }

    private static <E> void outList(LinkedList<E> linkedList){
        for (E e : linkedList) System.out.println(e);
    }
}
