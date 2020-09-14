package pr3.task3;

public class BookTest {
    public static void main(String[] args) {
        Book book1=new Book("А.С. Пушкин","Война и мир", 2003);
        System.out.println("Book1: "+book1.getAuthor()+" "+book1.getName()+" "+book1.getYear());
        book1.setYear(1234);
        book1.setName("Гарри Поттер");
        System.out.println("Book1: "+book1.getAuthor()+" "+book1.getName()+" "+book1.getYear());
    }
}
