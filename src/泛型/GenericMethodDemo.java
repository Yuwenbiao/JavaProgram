package 泛型;

public class GenericMethodDemo {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3};
        String[] strings = {"a", "b"};

        print(integers);
        print(strings);

        GenericMethodDemo.print(integers);
        GenericMethodDemo.print(strings);

        GenericMethodDemo.<Integer>print(integers);
        GenericMethodDemo.<String>print(strings);
    }

    public static <E> void print(E[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
