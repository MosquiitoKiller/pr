package pr20;

import java.io.FileWriter;
import java.io.IOException;

public class WriteInEnd {
    private String s="";
    private int maxLeng=2000;

    public WriteInEnd() {
        try(FileWriter writer = new FileWriter("src/pr20/war_copy.txt", false)){
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    void push(int el){
        s+= el==' '?'#':(char)el;
        if(s.length()==maxLeng) write();
    }

    void write(){
        try(FileWriter writer = new FileWriter("src/pr20/war_copy.txt", true)){
            writer.write(s);
            writer.flush();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        s="";
    }
}