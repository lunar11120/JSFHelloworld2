/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testproject1;

import com.model.Employee;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.html.HtmlInputHidden;

/**
 *
 * @author Juckkapun.l
 */
@ManagedBean(name="select2")
@RequestScoped
public class Select2Controller {
       private String messagePage2;
       private List<Employee> empList;
     // Init --------------------------------------------------------------------------------------
      private HtmlInputHidden addCount = new HtmlInputHidden();       
    
      public Select2Controller(){
      }
      
        @PostConstruct
	public void init() { 
            System.out.println("Select2Controller 2 Init Constructor ------------------------");
            addCount.setValue(0);
            
            empList = new ArrayList<Employee>();
            Employee emp = new Employee();
            emp.setId("11125"); emp.setName("Moobunk maha"); emp.setDivision("Sale DIV");
            empList.add(emp);
            Employee emp2 = new Employee();
            emp2.setId("11305"); emp2.setName("Yuyu Nishakirjr"); emp2.setDivision("Production DIV");
            empList.add(emp2);
        
        }     
       
       public String getHello(){
           messagePage2 = "Hello this is page Select2";
           return messagePage2;        
       }      
    
}
