package com.hy.test.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicSubject implements InvocationHandler{
    private Object subject;
    public DynamicSubject(Subject subject){
        this.subject = subject;
    }
    public Object invoke(Object object, Method method, Object[] args) throws Exception {
        System.out.println("Before rent, open transaction");
        method.invoke(object, args);
        System.out.println("After rent, close transaction");
        return null;
    }
}
