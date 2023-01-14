package com.driver;

import static java.io.FileDescriptor.out;

public class Main {
    public static void main(String[] args) {
        RWOnly r = new RWOnly();
        r.setName(100);
        System.out.print(r.getName());
        //java: Name has private access in com.driver.RWOnly
    }
}