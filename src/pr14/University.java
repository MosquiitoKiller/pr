package pr14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class University{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Сколько студентов?");
        int n=scanner.nextInt();
        Getters[] getters=new Getters[n];
        int id;
        double gpa;
        String name;
        for(int i = 0; i< getters.length; ++i){
            System.out.println("Student #"+(i+1));
            System.out.print("id = "); id=scanner.nextInt();
            System.out.print("\ngpa = "); gpa=scanner.nextDouble();
            System.out.print("\nname = "); name=scanner.next();
            System.out.print('\n');
            getters[i]= new Student(id,gpa,name);
        }

        sort(getters);
        System.out.println("Студенты после сортировки по gpa");
        out_students(getters);
        System.out.println("\nКакого студента хотите найти?");
            System.out.print("id = "); id=scanner.nextInt();
            System.out.print("\ngpa = "); gpa=scanner.nextDouble();
            System.out.print("\nname = "); name=scanner.next();
            System.out.print('\n');
            Getters g = new Student(id,gpa,name);
        int findedIndex;
        System.out.println("Каким методом поиска воспользоваться?\n\t1\tЛинейный итеративный\n\t2\tБинарный итеративный\n\t3\tЛинейный рекурсивный\n\t4\tБинарный рекурсивный");
        switch (scanner.nextInt()){
            case 1:
                findedIndex=linearSearchIter(getters,g);
                break;
            case 2:
                findedIndex=binSearchIter(getters,g);
                break;
            case 3:
                findedIndex=linearSearchRec(getters,g);
                break;
            case 4:
                findedIndex=binSearchRec(getters,g,0,getters.length);
                break;
            default:
                System.out.println("Вы остаетесь без поиска");
                return;
        }
        if(findedIndex < 0) System.out.println("Не нашлось такого студента");
        else System.out.println("Его индекс = "+findedIndex);
    }



    private static void sort(Getters[] getters){
        Arrays.sort(getters, new Comparator<>() {
            @Override
            public int compare(Getters o1, Getters o2) {
                return Double.compare(o1.getGpa(), o2.getGpa());
            }
        });
    }

    private static int linearSearchIter(Getters[] getters, Getters g){
        for (int i = 0; i < getters.length; i++) {
            if(getters[i].equals(g)) return i;
        }
        return Integer.MIN_VALUE;
    }

    private static int binSearchIter(Getters[] getters, Getters g){
        int mid,min=0,max=getters.length;
        while(true){
            mid=(max-min)/2+min;
            if((mid==min)||(mid==max)) break;

            if(g.getGpa()>=getters[mid].getGpa()) min=mid;
            else max=mid;
        }
        if(getters[mid].equals(g)) return mid;
        else return Integer.MIN_VALUE;
    }

    private static int linearSearchRec(Getters[] getters, Getters g) {
        if(getters.length==0) return Integer.MIN_VALUE;
        if(!getters[0].equals(g)){
            Getters[] gettersCopy=new Getters[getters.length-1];
            for (int i = 1; i < getters.length; i++) gettersCopy[i-1]=getters[i];
            return 1+linearSearchRec(gettersCopy,g);
        }
        else return 0;
    }

    private static int binSearchRec(Getters[] getters, Getters g,int min,int max) {
        int mid=(max-min)/2+min;
        if((mid==min)||(mid==max)){
            if(getters[mid].equals(g)) return mid;
            else return Integer.MIN_VALUE;
        }
        else if(g.getGpa()>=getters[mid].getGpa()) return binSearchRec(getters,g,mid,max);
        else return binSearchRec(getters,g,min,mid);
    }

    private static void out_students(Getters[] getters){
        System.out.println("id\t\tgpa\t\tname");
        for(Getters q:getters) System.out.println(q.getId()+"\t\t"+q.getGpa()+"\t\t"+q.getName());
    }
}
