package com.driver;

import static java.io.FileDescriptor.out;

public class Main {
    public static void main(String[] args) {
        RWOnly r = new RWOnly();
        r.setMember(100);
        System.out.print(r.getMember());
        //java: member has private access in com.driver.RWOnly
    }
}