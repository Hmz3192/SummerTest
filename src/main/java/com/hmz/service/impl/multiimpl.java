package com.hmz.service.impl;


import com.hmz.service.MultiService;
import org.springframework.stereotype.Service;

/**
 * @Author Hu mingzhi
 * Created by ThinKPad on 2017/7/2.
 */
@Service
public class multiimpl implements MultiService {
    public double res;

    public Double mul(double a,double b){
        res=a*b;
        System.out.print("乘法结果是："+res);
        return res;
    }
}
