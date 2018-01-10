package 集合.Collection.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("London");
        set.add("Paris");
        set.add("New York");

        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println("Sorted tree set:" + treeSet);

        System.out.println("first():" + treeSet.first());
        System.out.println("last():" + treeSet.last());
        System.out.println("headSet():" + treeSet.headSet("New York"));
        System.out.println("tailSet():" + treeSet.tailSet("New York"));

        System.out.println("lower()" + treeSet.lower("P"));
        System.out.println("higher()" + treeSet.higher("P"));
        System.out.println("floor()" + treeSet.floor("P"));
        System.out.println("ceiling()" + treeSet.ceiling("P"));
        System.out.println("pollFirst()" + treeSet.pollFirst());
        System.out.println("pollLast()" + treeSet.pollLast());
        System.out.println("New tree set:" + treeSet);
    }
}
