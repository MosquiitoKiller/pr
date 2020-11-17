package pr22.task1;

import java.util.Random;

public class Shop {
    static People base[]=new People[10];
    public static void main(String[] args) {
        Random random=new Random();
        int r;
        String s;
        int money;
        String name;
        for(int i=0;i<base.length;++i){
            r=random.nextInt(3)+5;//5..7 random length inn
            s = "";
            name="";
            for (int j=0;j<r;++j){
                s+=((char)(random.nextInt(10) + '0'));
            }
            name+=(char)(i+'0');
            money= i==0?700:i*1000;
            base[i]=new People(s,name,money);
        }
        for(int i=0;i<base.length;++i) System.out.println(base[i].getFIO()+"\t"+base[i].getINN()+"\t"+base[i].money);
        System.out.println();
        for (int i=0;i<base.length;++i){
            try {
                if(checkINN(base[i])) base[i].money-=500;
            }
            catch (InnException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("\nBase after shopping\n");
        for(int i=0;i<base.length;++i) System.out.println(base[i].getFIO()+"\t"+base[i].getINN()+"\t"+base[i].money);
    }
    private static boolean checkINN(People people) throws InnException {
        if(people.getINN().length()==6) return true;
        else throw new InnException(people.getFIO()+ " have invalid inn");
    }
}
