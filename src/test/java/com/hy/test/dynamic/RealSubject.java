package com.hy.test.dynamic;

public class RealSubject implements Subject{
    public void rent(String name) {
        System.out.print(name + "say: I am rent a house...");
    }
}
