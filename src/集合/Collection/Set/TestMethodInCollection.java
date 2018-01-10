package 集合.Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class TestMethodInCollection {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("London");
        set.add("Paris");
        set.add("New York");

        System.out.println(set);
        System.out.println(set.size());

        set.remove("London");
        System.out.println(set);
        System.out.println(set.size());

        Set<String> set1 = new HashSet<>();

        set1.add("London");
        set1.add("Shanghai");
        set1.add("Paris");
        System.out.println(set1);
        System.out.println(set1.size());

        System.out.println(set1.contains("Taipei"));
        set.addAll(set1);
        System.out.println(set);
        set.removeAll(set1);
        System.out.println(set);
        set.retainAll(set1);
        System.out.println(set);
    }
}
