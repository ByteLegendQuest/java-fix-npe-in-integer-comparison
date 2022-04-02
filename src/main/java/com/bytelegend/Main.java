package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(compare(123, 456));
        System.out.println(compare(123, 123));
        System.out.println(compare(123, null));
    }

    public static boolean compare(int a, Integer b) {
        if ( b = null) {
            return false;
        }
        return a == b;
    }
}
