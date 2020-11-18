package pr23.task2_3;

import pr15.VecException;

public class Main {
    public static void main(String[] args) {
        String[] strings={"qwertyu","asdfghjkl","zxcvbnm,","1234567890-=","!@#$%^&*()_+"};
        SaveMas<String> stringSaveMas=new SaveMas<>(strings);
        Integer[] ints={68498,98987,96531,103096,65};
        SaveMas<Integer> integerSaveMas=new SaveMas<>(ints);
        try {
            System.out.println(stringSaveMas.get(1));
            System.out.println(integerSaveMas.get(4));
            System.out.println(integerSaveMas.get(111000));
        } catch (VecException e) {
            System.out.println(e.message());
        }
    }
}
