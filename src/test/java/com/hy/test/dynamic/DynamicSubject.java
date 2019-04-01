package com.hy.test.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicSubject implements InvocationHandler{
    private Object subject1;
    public DynamicSubject(Subject subject){
        this.subject1 = subject;
    }
    public Object invoke(Object subject, Method method, Object[] args) throws Exception {
        System.out.println("Before rent, open transaction");
        method.invoke(subject1, args);
        System.out.println("After rent, close transaction");
        return null;
    }
}
