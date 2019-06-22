package com.adcc.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 2019/6/22
 * suh
 **/
public class ConcretePrototype implements Prototype{
    private String  name;
    private Integer age;
    private List hobbies;

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

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public ConcretePrototype clone() {
        ConcretePrototype prototype = new ConcretePrototype();

        prototype.setName(this.name);
        prototype.setAge(this.age);
        prototype.setHobbies(this.hobbies);
        return prototype;
    }
}
