package pr19;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("запись в файл");
        try(FileWriter writer = new FileWriter("src/pr19/text_pr19.txt", false)){
            writer.write(scanner.nextLine());
            writer.flush();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Вывод файла");
        try(FileReader reader =new FileReader("src/pr19/text_pr19.txt")){
            char[] s=new char[1000];
            int len=reader.read(s);
            reader.close();
            for (int i=0;i<len;++i) System.out.print(s[i]);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("\nЗамена информации в файле");
        try(FileWriter writer = new FileWriter("src/pr19/text_pr19.txt", false)){
            writer.write(scanner.nextLine());
            writer.flush();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Добавление в конец");
        try(FileWriter writer = new FileWriter("src/pr19/text_pr19.txt", true)){
            writer.write(scanner.nextLine());
            writer.flush();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
