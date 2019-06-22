package com.adcc.prototype.monkey;

import java.io.Serializable;

/**
 * 2019/6/22
 * suh
 **/
public class JinGuBang implements Serializable{
    private int h;
    private int d;

    public void big(){
        h *= 2;
        d *= 2;
    }

    public void small(){
        h /= 2;
        d /= 2;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
}
