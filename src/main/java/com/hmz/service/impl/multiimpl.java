package com.hmz.service.impl;


import com.hmz.service.multi;

/**
 * @Author Hu mingzhi
 * Created by ThinKPad on 2017/7/2.
 */
public class multiimpl implements multi {
    public double res;

    public void mul(double a,double b){
        res=a*b;
        System.out.print("乘法结果是："+res);
    }
}
