package pr1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] mas=new int[10];
        for (int i=0;i<10;++i) mas[i]=(int)(Math.random()*1000);
        for(int q:mas) System.out.print(q+" ");
        System.out.println();
        sort(mas);
        for(int q:mas) System.out.print(q+" ");
        System.out.println();
        Random random =new Random();
        for (int i=0;i<10;++i) mas[i]=random.nextInt(500);
        for(int q:mas) System.out.print(q+" ");
        System.out.println();
        sort(mas);
        for(int q:mas) System.out.print(q+" ");

        System.out.println("\n\nfact(5)="+fact(5));
    }
    public static int fact(int a){
        int res=1;
        for(int i=1;i<=a;++i) res*=i;
        return res;
    }

    public static void sort(int[] mas){
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i+1]) {
                    temp = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }
}
