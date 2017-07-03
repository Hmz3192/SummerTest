package com.hmz.service.impl;


import com.hmz.service.plus;

/**
 * @Author Hu mingzhi
 * Created by ThinKPad on 2017/7/2.
 */
public class plusimpl implements plus {
    public double res;
    public void plu(double a,double b){
        res=a+b;
        System.out.print("加法结果是："+res);
    }
}
