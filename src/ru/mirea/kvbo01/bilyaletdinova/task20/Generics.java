package ru.mirea.kvbo01.bilyaletdinova.task20;

import java.io.Serializable;

public class Generics <T extends Comparable<T>,V extends Animal & Serializable,K  > {
    T a;
    V b;
    K c;

    public Generics(T a, V b, K c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public V getB() {
        return b;
    }

    public void setB(V b) {
        this.b = b;
    }

    public K getC() {
        return c;
    }

    public void setC(K c) {
        this.c = c;
    }
    public void print(){
        System.out.println(a.getClass());
        System.out.println(b.getClass());
        System.out.println(c.getClass());
    }
}
