package com.alibaba.webx.tutorial1.app1.module.action;

import com.alibaba.citrus.turbine.Navigator;
import com.alibaba.citrus.turbine.dataresolver.FormGroup;
import com.alibaba.webx.tutorial1.app1.Visitor;

public class PasswordAction {
	  public void doShow(@FormGroup("password") Visitor visitor, Navigator nav) {
	        String password = visitor.getPasswd();  
	        String name = "test";
	        nav.redirectTo("app1Link").withTarget("form/welcome").withParameter("name", password);
	    }
}
