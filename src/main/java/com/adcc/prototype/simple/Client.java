package com.adcc.prototype.simple;

/**
 * 2019/6/22
 * suh
 **/
public class Client {
    private Prototype prototype;

    public Client(Prototype prototype){
        this.prototype = prototype;
    }

    public Prototype starClone(Prototype concretePrototype){
        return concretePrototype.clone();
    }

    public Prototype starClone(){
        return this.prototype.clone();
    }

}
