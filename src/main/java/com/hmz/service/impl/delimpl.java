package com.hmz.service.impl;


import com.hmz.service.del;

/**
 * @Author Hu mingzhi
 * Created by ThinKPad on 2017/7/2.
 */
public class delimpl implements del {

    public double res;
    public void del(double a,double b){
        res=a-b;
        System.out.print("减法结果是："+res);
    }
}
