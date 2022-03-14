package com.sparta.ss.week1.solid;

public class S {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    Below class doesn't belong in this class
//    public boolean isOver50(int age) {
//        return age > 50;
//    }

    @Override
    public String toString() {
        return "S{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
