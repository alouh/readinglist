package com.han.readinglist;

import java.nio.charset.Charset;

public class ReadinglistApplicationTests {
    public static void main(String... args) {
        String s1 = "鑼冩儬";
        byte[] bytes1 = s1.getBytes(Charset.forName("GBK"));
        String s2 = "范惠";
        byte[] bytes2 = s2.getBytes(Charset.forName("UTF8"));
        System.out.println();
    }
}
