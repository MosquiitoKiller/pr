package pr22.task1;

public class People {
    private String  INN;
    private String FIO;
    int money;

    public People(String INN, String FIO, int money) {
        this.INN = INN;
        this.FIO = FIO;
        this.money = money;
    }

    public String  getINN() {
        return INN;
    }

    public String getFIO() {
        return FIO;
    }
}
