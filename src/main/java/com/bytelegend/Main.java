package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(compare(123, 456));
        System.out.println(compare(123, 123));
        System.out.println(compare(123, 10));
    }

    public static boolean compare(int a, Integer b) {
        return Integer.valueOf(a).equals(b);
    }
}
