package com.adcc.prototpye;

import com.adcc.prototype.simple.Client;
import com.adcc.prototype.simple.ConcretePrototype;
import com.adcc.prototype.simple.Prototype;
import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.ArrayList;
import java.util.List;

/**
 * 2019/6/22
 * suh
 **/
public class SimplePrototypeTest {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setName("Suh");
        prototype.setAge(36);
        List<String> list = new ArrayList<String>();
        list.add("swim");
        prototype.setHobbies(list);
        System.out.println(prototype);
        System.out.println(prototype.getHobbies());

        Client client = new Client(prototype);
        ConcretePrototype prototypeC = (ConcretePrototype)client.starClone(prototype);
        System.out.println(prototypeC);
        prototypeC.getHobbies().add("football");

        System.out.println(prototype);
        System.out.println(prototypeC.getHobbies());

        System.out.println(prototype.getHobbies() == prototypeC.getHobbies());
    }



}
