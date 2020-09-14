package pr3.task2;

public class Hand {
    private int length;
    public Hand(int length) {
        this.length = length;
    }
    void take(String subject){
        System.out.println(subject+" взят(-о/-а)");
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
