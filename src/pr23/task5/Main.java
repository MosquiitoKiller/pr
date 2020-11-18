package pr23.task5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Integer[] mas={1656,68498,13516,789,312};
        String[] strings={"qwer","asdf","zxcvb","yuiop","1234567890"};
        ArrayList<Integer> arrayList=Solution.newArrayList(mas);
        HashSet<String> hashSet=Solution.newHashSet(strings);
        Pair<String,Integer>[] pairs=new Pair[Math.min(mas.length,strings.length)];
        for (int i = 0; i < Math.min(mas.length,strings.length); i++)pairs[i]=new Pair<>(strings[i],mas[i]);
        Map<String,Integer> hashMap=Solution.newHashMap(pairs);
        System.out.println("ArrayList\n");
        for (Integer i : arrayList) System.out.println(i);
        System.out.println("\nHashSet\n");
        for (String i : hashSet) System.out.println(i);
        System.out.println("\nHashMap\n");
        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
