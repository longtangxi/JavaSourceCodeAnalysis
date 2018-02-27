package com.ty.serializable;

import java.io.Serializable;

/**
 * 简介：
 *
 * @author 87627
 * @create 2018/2/26
 * @since 1.0.0
 */
public class Person implements Serializable {

    private static final long serialVersionUID = 1909491539791319132L;
    private String name;
    int age;
    Card card;//若引用对象card不可序列化，那么Person类也不可序列化
    double[] infos;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        card = new Card();
        infos = new double[5];
    }

    public String toString() {
        return "name:" + name + "\tage:" + age + "\tcard:" + card + "\tinfos:" + infos.length;
    }
}