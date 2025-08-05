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
@ManagedBean(name="hello_world")
@RequestScoped
public class HelloWorld {
    private String user_name;
    private String message1;
    private String message2;
       

    public HelloWorld() {
    }
    public void testInput1(){
         System.out.println("[Controller] : "+message2);
    }
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.message1 = "test: Xhtml001";
        this.user_name = user_name;
    }

    public String getMessage1() {
        return message1;
    }

    public void setMessage1(String message1) {
        this.message1 = message1;
    }

    public String getMessage2() {
        return message2;
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }
    
    
}
