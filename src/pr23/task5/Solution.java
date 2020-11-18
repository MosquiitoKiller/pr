package pr23.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static <T> ArrayList<T> newArrayList(T[] mas){
        ArrayList<T> copy=new ArrayList<T>();
        for (T t:mas) copy.add(t);
        return copy;
    }
    public static <T> HashSet<T> newHashSet(T[] mas){
        HashSet<T> copy=new HashSet<T>();
        for (T t:mas) copy.add(t);
        return copy;
    }
    public static <K,V> HashMap<K,V> newHashMap(Pair<K,V>[] mas){
        HashMap<K,V> copy=new HashMap<K,V> ();
        for (Pair<K, V> p : mas) copy.put(p.getKey(),p.getValue());
        return copy;
    }
}
