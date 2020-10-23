package pr16;

import java.util.*;

public class Drunkard {
    int[] pack={0,1,2,3,4,5,6,7,8,9};
    ArrayDeque<Integer> player1=new ArrayDeque<>(5);
    ArrayDeque<Integer> player2=new ArrayDeque<>(5);
    public Drunkard() {
        Random random=new Random();
        int count = 10;
        int ran,k=0;
        boolean[] hash = new boolean[10];
        for(int i=0;i<10;++i){
            if(i==9) ran=0;
            else ran=random.nextInt(1000)%(10-i);
            for(int j=0;j<10;++j) {
                if (k == ran && !hash[j]) {
                    if (i %2==0) player1.addLast(j);
                    else player2.addLast(j);
                    hash[j] = true;
                    break;
                } else if (!hash[j]) ++k;
            }
            k=0;
        }
        for (int q : player1) {
            System.out.print(q+" ");
        }
        System.out.println("");
        for (int q:player2) {
            System.out.print(q+" ");
        }
        System.out.println("");
    }
    void game(){
        int count=0;
        while (!player1.isEmpty()&&!player2.isEmpty()){
            if(player1.getFirst()==0 && player2.getFirst()==9){
                add(player1,player2.pollFirst());
            }
            else if(player1.getFirst()==9 && player2.getFirst()==0){
                add(player2,player1.pollFirst());
            }
            else{
                if(player1.getFirst()>player2.getFirst()) add(player1,player2.pollFirst());
                else add(player2,player1.pollFirst());
            }
            ++count;
            if(count==106){
                System.out.println("botva");
                return;
            }
        }
        if(player1.isEmpty()) System.out.println("\nsecond "+count);
        else System.out.println("\nfirst "+count);
    }
    private void add(ArrayDeque<Integer> player, int sec){

        player.addLast(player.pollFirst());
        player.addLast(sec);
    }
}
