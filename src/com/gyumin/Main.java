package com.gyumin;

public class Main {

    public static void main(String[] args) {
        String str1 = "Host: localhost:8888";

        String[] str = str1.split(": ");
        System.out.println(str[0]);
        System.out.println(str[1]);
    }
}