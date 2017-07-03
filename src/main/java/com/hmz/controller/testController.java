package com.hmz.controller;

import com.hmz.service.DelService;
import com.hmz.service.DivideService;
import com.hmz.service.MultiService;
import com.hmz.service.PlusService;
import com.sun.org.apache.xpath.internal.operations.Plus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import static javafx.scene.input.KeyCode.M;

/**
 * @Author Hu mingzhi
 * Created by ThinKPad on 2017/7/2.
 */

/**
 * @Controller 通过Spring的自动扫描功能，把一个POJO转化为处理请求的控制器
 * 通过@RequestMapping标注，可以将特定的url和具体的controller类或controller类中的方法绑定。
 * @RequestMapping("/user") 处理来自/user的请求,一般来说是用于区分不同模块的
 */
@Controller
@RequestMapping("/user")
public class testController {

    @Resource
    private DelService delservice;
    @Resource
    private DivideService divideService;
    @Resource
    private MultiService multiService;
    @Resource
    private PlusService plusService;

    /**
     * 处理/user的请求，请求的方法为POST
     * 参数的User对象是把页面的表单值放进一个User对象中
     * ModelAndView 是返回一个View。在这里我们是一个JSP页面。
     */
    @RequestMapping(value = "/view")
    public ModelAndView show() {
        //ModelAndView.setViewName("/success") 根据mvc的配置文件，可知返回的是/user/success.jsp
        ModelAndView view = new ModelAndView();
        view.setViewName("/view");
        return view;
    }

    @RequestMapping(value = "/cal", method = RequestMethod.POST)
    public ModelAndView cal(HttpServletRequest request, String nummessege) {
        //ModelAndView.setViewName("/success") 根据mvc的配置文件，可知返回的是/user/success.jsp

        String[] res = nummessege.split(" ", 3);

        ModelAndView modelAndView = new ModelAndView();
        for (int i = 0; i < res.length; i++) {
            System.out.println("第" + i + "是" + res[i]);
        }
        double a = Double.parseDouble(res[0]);
        double b = Double.parseDouble(res[2]);
        String c = res[1];
        double f = 0;
        if (c.equals("+")) {
            f = plusService.plu(a, b);
        } else if (c.equals("-")) {
            f = delservice.del(a, b);
        } else if (c.equals("*")) {
            f = multiService.mul(a, b);
        } else if (c.equals("/")) {
            f = divideService.divi(a, b);
        } else {
            System.out.println("no");
        }
        modelAndView.setViewName("/view");
        modelAndView.addObject("res", f);
//        System.out.println(f);
        return modelAndView;
    }
}
