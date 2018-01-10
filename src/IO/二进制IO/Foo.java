package IO.二进制IO;

import java.io.Serializable;

public class Foo implements Serializable {
    private int v1;
    private static double v2;
    private transient A v3 = new A();
}

class A {
}