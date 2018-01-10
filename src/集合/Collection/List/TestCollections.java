package 集合.Collection.List;

import java.util.*;

public class TestCollections {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("red", "green", "blue");
        Collections.sort(list);
        System.out.print(list + " ");
        System.out.println();

        Collections.sort(list, Collections.reverseOrder());
        System.out.print(list + " ");
        System.out.println();

        List<Integer> list1 = Arrays.asList(2, 4, 6, 7, 8, 44, 76, 88);
        System.out.println(Collections.binarySearch(list1, 7));
        System.out.println(Collections.binarySearch(list1, 9));

        List<String> list7 = Arrays.asList("blue", "green", "red");
        System.out.println(Collections.binarySearch(list7, "blue"));
        System.out.println(Collections.binarySearch(list7, "cyan"));

        Collections.reverse(list);
        System.out.print(list + " ");

        Collections.shuffle(list);
        System.out.print(list + " ");

        List<String> list2 = Arrays.asList("yellow", "red", "green");
        List<String> list3 = Arrays.asList("yellow", "red", "green");
        Collections.shuffle(list2, new Random(20));
        Collections.shuffle(list3, new Random(20));
        System.out.print(list2 + " ");
        System.out.print(list3 + " ");

        List<String> list4 = Arrays.asList("yellow", "red", "green", "blue");
        List<String> list5 = Arrays.asList("white", "black");
        Collections.copy(list4, list5);
        System.out.print(list4 + " ");

        List<GregorianCalendar> list6 = Collections.nCopies(5, new GregorianCalendar(2005, 0, 1));

        Collections.fill(list, "black");
        System.out.print(list + " ");

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        System.out.println(Collections.disjoint(list, list2));

        System.out.println(Collections.frequency(list, "black"));
    }
}
