package pr23.task4;

import java.io.File;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        File dir = new File("/Users/Максим/Desktop/Лабы/Pr_/src");

        if (dir.exists()) {
            LinkedList<String> files=new LinkedList<>(pr23.task1.Main.convert(dir.list()));
            for (int i=0;i<5&&i<files.size();++i) System.out.println(files.get(i));
        }
        else System.out.println("Не существует данного каталога");
    }
}
