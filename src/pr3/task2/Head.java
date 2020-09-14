package pr3.task2;

public class Head {
    private int size;

    public Head(int size) {
        this.size = size;
    }

    void think(){
        System.out.println("Голова подумала о чем-то философском...");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
