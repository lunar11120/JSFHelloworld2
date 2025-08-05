/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testproject1;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Juckkapun.l
 */
@ManagedBean(name="frontController")
@RequestScoped
public class FrontController {
	
	
	private String msg1;
	public String sayHello() {
                System.out.println("Say Hello Invoking ----------");
		msg1 = "Test Message : Front Controller";
		
		return msg1;
	}
	public String getMsg1() {
		msg1="msg1 : say Hello YEH";
		return msg1;
	}
	public void setMsg1(String msg1) {
		this.msg1 = msg1;
	}

  
}
