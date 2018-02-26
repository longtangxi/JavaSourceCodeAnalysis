package com.ty.serializable;

import java.io.Serializable;

/**
 * 简介：
 *
 * @author 87627
 * @create 2018/2/26
 * @since 1.0.0
 */
class Person implements Serializable {

    private static final long serialVersionUID = 1909491539791319132L;
    transient String name;
    transient int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "name:" + name + "\tage:" + age;
    }
}