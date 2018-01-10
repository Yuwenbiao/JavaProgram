package 集合.Collection.List;

import java.util.*;

public class SetListPerformanceTest {
    public static void main(String[] args) {
        Collection<Integer> set1 = new HashSet<>();
        System.out.println(getTestTime(set1, 500000));

        Collection<Integer> set2 = new LinkedHashSet<>();
        System.out.println(getTestTime(set2, 500000));

        Collection<Integer> set3 = new TreeSet<>();
        System.out.println(getTestTime(set3, 500000));

        Collection<Integer> list1 = new ArrayList<>();
        System.out.println(getTestTime(list1, 60000));

        Collection<Integer> list2 = new LinkedList<>();
        System.out.println(getTestTime(list2, 60000));
    }

    public static long getTestTime(Collection<Integer> c, int size) {
        long startTime = System.currentTimeMillis();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        Collections.shuffle(list);

        for (int element : list) {
            c.add(element);
        }

        Collections.shuffle(list);


        for (int element : list) {
            c.remove(element);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

}
