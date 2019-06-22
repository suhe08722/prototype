package com.adcc.prototype.monkey;

import java.io.*;
import java.util.Date;

/**
 * 2019/6/22
 * suh
 **/
public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {
    public JinGuBang jinGuBang;

    public QiTianDaSheng(){
        this.setBirthday(new Date());
       this.jinGuBang = new JinGuBang();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{

        return this.deepClone();

    }

    public Object deepClone(){

        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            QiTianDaSheng copy = (QiTianDaSheng)ois.readObject();
            copy.setBirthday(new Date());
            return  copy;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public QiTianDaSheng shollowCopy(QiTianDaSheng target){
        QiTianDaSheng copy = new QiTianDaSheng();
        copy.setHeight(target.getHeight());
        copy.setWeight(target.getWeight());
        copy.setBirthday(new Date());
        copy.jinGuBang = target.jinGuBang;

        return copy;
    }

}
