package com.adcc.prototype.monkey;

import com.adcc.prototype.monkey.QiTianDaSheng;

/**
 * 2019/6/22
 * suh
 **/
public class QiTianDaShengTest {
    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        try {

            QiTianDaSheng mao1 = (QiTianDaSheng)qiTianDaSheng.clone();
            System.out.println(qiTianDaSheng.jinGuBang == mao1.jinGuBang);
        }catch (Exception e){
            e.printStackTrace();
        }

        QiTianDaSheng q = new QiTianDaSheng();
        QiTianDaSheng mao2 = qiTianDaSheng.shollowCopy(q);
        System.out.println(q.jinGuBang == mao2.jinGuBang);
    }
}
