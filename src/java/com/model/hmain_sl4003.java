/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author Juckkapun.l
 */
public class hmain_sl4003 {
     private String hmain;
     private String hname;
     private String display;

    public hmain_sl4003() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getHmain() {
        return hmain;
    }

    public void setHmain(String hmain) {
        this.hmain = hmain;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "hmain_sl4003{" + "hmain=" + hmain + ", hname=" + hname + ", display=" + display + '}';
    }

    public hmain_sl4003(String hmain, String hname, String display) {
        this.hmain = hmain;
        this.hname = hname;
        this.display = display;
    }
     
     
}
