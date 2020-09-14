package pr3.task2;

public class Leg {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Leg(int size) {
        this.size = size;
    }
    void kick(String subject){
        System.out.println("Поздравляем, вы удачно пнули "+subject);
    }
}
