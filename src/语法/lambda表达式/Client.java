package 语法.lambda表达式;

import java.util.Optional;
import java.util.function.Supplier;

public class Client {
    public static void main(String[] args) {
        Outer outer = new Outer();
        if (outer != null && outer.nested != null && outer.nested.inner != null) {
            System.out.println(outer.nested.inner.foo);
        }

        //通过利用 Java 8 的 Optional 类型来摆脱所有这些 null 检查
        Optional.of(new Outer()).map(Outer::getNested).map(Nested::getInner).map(Inner::getFoo).ifPresent(System.out::println);

        //还有一种实现相同作用的方式就是通过利用一个 supplier 函数来解决嵌套路径的问题
        Outer obj = new Outer();
//        resolve(() -> obj.getNested().getInner().getFoo()).ifPresent(System.out::println);
    }
}
