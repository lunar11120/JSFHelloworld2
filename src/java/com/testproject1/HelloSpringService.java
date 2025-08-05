package com.testproject1;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Service;


@ManagedBean(name = "helloSpringService" , eager = true)
@SessionScoped

public class HelloSpringService {
	private String congig_Bean_show = "cgon bean1 : 1021224455 : status 101 : connection";
		
	public String configBeanshow() {
		System.out.println("Invoking Service Bean : <=== Hello ===> [service : HelloSpringService]");	
		return congig_Bean_show;
	}
	public String getCongig_Bean_show() {
		return congig_Bean_show;
	}
	public void setCongig_Bean_show(String congig_Bean_show) {
		this.congig_Bean_show = congig_Bean_show;
	}
	
	
}
