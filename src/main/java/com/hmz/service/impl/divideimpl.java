package com.hmz.service.impl;


import com.hmz.service.divide;

/**
 * @Author Hu mingzhi
 * Created by ThinKPad on 2017/7/2.
 */
public class divideimpl implements divide {
    public double res;
    public void divi(double a,double b){
        res=a/b;
        System.out.print("除法结果是："+res);
    }
}
