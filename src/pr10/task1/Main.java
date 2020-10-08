package pr10.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k,d;
        Scanner scanner =new Scanner(System.in);
        k=scanner.nextInt();
        d=scanner.nextInt();
        int count=0;
        for(int i=(int)Math.pow(10,k-1);i<(int)Math.pow(10,k);++i){
            if(kol_znak(i)==d) ++count;
        }
        System.out.println(count);
    }
    static int kol_znak(int a){
        int sum=0;
        while(a!=0){
            sum+=a%10;
            a/=10;
        }
        return sum;
    }
}
