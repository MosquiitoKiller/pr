package pr20;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int c;
        WriteInEnd writeInEnd = new WriteInEnd();
        ArrayList<Word> words = new  ArrayList<>();
        boolean q;
        String temp="";
        boolean flag;
        try(FileReader reader =new FileReader("src/pr20/war.txt")){
            while ((c=reader.read())!=-1){
                q=((char)c>='A'&&(char)c<='Z')||((char)c>='a'&&(char)c<='z')||(c>=1040 && c<=1071)||(c>=1072 && c<=1103)||((char)c=='\'');
                writeInEnd.push(c);
                if(q){
                    if((char)c>='A'&&(char)c<='Z') c+=('a'-'A');
                    else if(c>=1040 && c<=1071) c+=1072-1040;
                    temp+=(char)c;
                }
                if(!temp.equals("")&&!q){
                    flag=false;
                    for(int j=0;j<words.size();++j){
                        if(words.get(j).str.equals(temp)){
                            ++words.get(j).kol;
                            flag=true;
                            break;
                        }
                    }
                    if(!flag) words.add(new Word(temp));
                    temp="";
                }
            }
            writeInEnd.write();
            reader.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        int max=0;
        String mostPopularWord="not found";
        for(int i=0;i<words.size();++i){
            if(words.get(i).kol>max){
                max=words.get(i).kol;
                mostPopularWord=words.get(i).str;
            }
        }

        words.sort(Comparator.comparingInt(o -> o.kol));
        for (Word a: words) {
            System.out.println(a.str+" "+a.kol);
        }
        System.out.println();
        for (int i = 0; i < 15; i++) System.out.print('^');
        System.out.println();
        for (int i = 0; i < 15; i++) System.out.print('|');
        System.out.println("\nСписок всех слов");

        System.out.println("\nСамое часто встречаемое слово - \""+mostPopularWord+"\", оно встечается "+max+" раз");
    }
}
