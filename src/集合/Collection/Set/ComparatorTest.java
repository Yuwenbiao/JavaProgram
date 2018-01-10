package 集合.Collection.Set;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorTest implements Comparator<ComparatorTest.Num>, Serializable {
    @Override
    public int compare(Num o1, Num o2) {
        if (o1.i < o2.i) {
            return 1;
        } else if (o1.i == o2.i) {
            return 0;
        } else return -1;
    }

    public static void main(String[] args) {
        Set<Num> set = new TreeSet<>(new ComparatorTest());
        set.add(new Num(1));
        set.add(new Num(2));
        set.add(new Num(3));

        for (Num n : set) {
            System.out.println(n.i);
        }
    }

    static class Num {
        int i;

        public Num(int i) {
            this.i = i;
        }
    }
}
