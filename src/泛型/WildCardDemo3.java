package 泛型;

public class WildCardDemo3 {
    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack<>();
        GenericStack<Object> stack2 = new GenericStack<>();
        stack2.push("java");
        stack2.push(2);
        stack1.push("sun");
        add(stack1, stack2);
        WildCardDemo2.print(stack2);
    }

    public static <T> void add(GenericStack<T> stack, GenericStack<? super T> stack2) {
        while (!stack.isEmpty())
            stack2.push(stack.pop());
    }
}
