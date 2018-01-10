package 集合.Collection.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("New York");

        System.out.println(set);

        for (Object element : set) {
            System.out.println(element.toString().toLowerCase() + " ");
        }
    }
}
