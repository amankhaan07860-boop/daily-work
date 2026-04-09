package Java17.strongencapsulation;

import sun.misc.Unsafe;
public class Example {
    public static void main(String[] args) {
    Unsafe unsafe = Unsafe.getUnsafe();
        System.out.println(unsafe);
    }
}
