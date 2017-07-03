package com.hmz.service.impl;


import com.hmz.service.DivideService;
import org.springframework.stereotype.Service;

/**
 * @Author Hu mingzhi
 * Created by ThinKPad on 2017/7/2.
 */
@Service
public class divideimpl implements DivideService {
    public double res;
    public Double divi(double a,double b){
        res=a/b;
        System.out.print("除法结果是："+res);
        return res;
    }
}
