package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(compare(123, 456));
        System.out.println(compare(123, 123));
        System.out.println(compare(123, null));
    }

    public static boolean compare(int a, Integer b) {
        if (b == null) {
            return false;
        }
        else {
            return a == b;
        }
    }
    //Integer 变量(无论是否是 new 生成的)与 int 变量比较，只要两个变量的值是相等的，结果都为 true。
    //这涉及到一个叫做自动拆箱的过程，就是将包装类自动转换成对应的基本数据类型，
    //(与此相反的自动装箱就是将基本数据类型自动转换成对应的包装类，以后也会见到)，
    //此时就是两个数值的比较，结果必定为true。
}
