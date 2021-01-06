package com.crille.entity;

import java.io.Serializable;

/**
 * @program: spring
 * @description: 用户类
 * @author: Crille-g
 * @create: 2021-01-06 16:06
 **/
public class User implements Serializable {
    private static final long serialVersionUID = -3230156161186644024L;
    private String name;
    private Integer age;

    public User() {
        System.out.println("初始化！");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private String sex;

}
