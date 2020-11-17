package pr21.task12_4;

public class Main {
    public static void main(String[] args) {
        Exception2 exception2=new Exception2();
        try {
            exception2.exceptionDemo();
        }
        catch (Exception e){
            System.out.println("Infinity");
        }
        finally {
            System.out.println("End of program");
        }
    }
}
