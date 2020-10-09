package pr12;

public class Main {
    public static void main(String[] args) {
        Planet[] planets=Planet.values();
        for(Planet p:planets){
            System.out.println(p.getGravity());
        }
    }
}
