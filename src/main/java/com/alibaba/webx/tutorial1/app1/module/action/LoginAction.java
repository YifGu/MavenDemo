package com.alibaba.webx.tutorial1.app1.module.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.citrus.turbine.Context;
import com.alibaba.citrus.turbine.Navigator;
import com.alibaba.citrus.turbine.dataresolver.FormGroup;
import com.alibaba.citrus.turbine.dataresolver.Param;
import com.alibaba.webx.tutorial1.app1.Visitor;
public class LoginAction {

    public void doCheck(@FormGroup("login")Visitor visitor,Navigator nav) {
        String name = visitor.getName();
        String passwd = visitor.getPasswd(); //怎么调试呢，怎么看这里的passwd有没有值
   
        if("admin".equals(name) && !passwd.isEmpty()){
            nav.redirectTo("app1Link").withTarget("form/welcome").withParameter("name",name); //为什么不能实现跳转
       }else{
             
        }
        
    }
 
}