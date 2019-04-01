package com.hy.test.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args){
        Subject subject = new RealSubject();
        InvocationHandler  handler = new DynamicSubject(subject);
        Subject dynamicSubject = (Subject) Proxy.newProxyInstance(Client.class.getClassLoader(), subject.getClass().getInterfaces(), handler);
        dynamicSubject.rent("Li lei");
    }
}
