package com.interview.test;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class NoBroker {
    static class ClassA {
        void doMethod() throws ArrayIndexOutOfBoundsException{
            System.out.println("i am in class A calling from doMethod");
        }
    }

    static class ClassB extends ClassA implements Serializable {
        @Override
        void doMethod() throws IndexOutOfBoundsException {
            System.out.println("i am in class B calling from doMethod");
        }
    }
    public static void main(String[] args) {
        ClassA a = new ClassB();
        a.doMethod();
    }
}
