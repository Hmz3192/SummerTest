package com.hmz.service.impl;


import com.hmz.service.DelService;
import org.springframework.stereotype.Service;

/**
 * @Author Hu mingzhi
 * Created by ThinKPad on 2017/7/2.
 */
@Service
public class delimpl implements DelService {

    public double res;
    public Double del(double a,double b){
        res=a-b;
        System.out.print("减法结果是："+res);
        return res;
    }
}
