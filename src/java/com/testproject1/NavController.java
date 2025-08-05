/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testproject1;


import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SuppressWarnings("serial")
@ManagedBean(name=NavController.CONTROLLER_NAME)
@SessionScoped
public class NavController implements Serializable {
	public static final String CONTROLLER_NAME = "navController";
	
        
        
	public String nhsoLogin() {
		return "https://iam.nhso.go.th/realms/nhso/account";
	}        
        
	public String moveToPage1() {
		return "page1";
	}
	
	public String moveToPage2() {
		return "page2";
	}
	
	public String moveToPage3() {
		return "page3";
	}	
	
	public String moveToPage4() {
		return "autoComplete";
	}	
	public String moveToPage5() {
		return "page5";
	}	      
	public String moveToPage6() {
		return "page6";
	}	
	public String moveToPage7() {
		return "page7";
	}	
	public String moveToPage8() {
		return "page8";
	}		
	public String moveToPage9() {
		return "page9";
	}	
	public String moveToPage14() {
		return "page14";
	}	
	public String moveToPage15() {
		return "page15";
	}	
        
	public String moveToPlayer() {
		return "player";
	}        
	
	public String moveToPage16() {
		return "page16_bdo_database_index";
	}
	
	public String backToIndex() {
		return "index";
	}
	
	public String goPrimeface1() {
		return "prime1";
	}
	public String moveToSelect2() {
		return "select2";
	}        
	
	
	//Test Workshop Mock SL2019
	public String moveToSL2019() {
		return "pages/master/sl2019";
	}	

	
	
}
