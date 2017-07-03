package com.hmz.service.impl;


import com.hmz.service.PlusService;
import org.springframework.stereotype.Service;

/**
 * @Author Hu mingzhi
 * Created by ThinKPad on 2017/7/2.
 */
@Service
public class plusimpl implements PlusService {
    public double res;

     public Double plu(double a,double b){
        res=a+b;
        System.out.print("加法结果是："+res);
        return res;
    }
}
