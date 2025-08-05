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
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.HtmlInputHidden;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author Juckkapun.l
 */
@ManagedBean(name="page2")
@RequestScoped
public class Page2Controller {
       private String messagePage2;
       private List<Employee> empList;
     // Init --------------------------------------------------------------------------------------
      private HtmlInputHidden addCount = new HtmlInputHidden();   
       
      public Page2Controller(){
      }
      
        @PostConstruct
	public void init() { 
            System.out.println("Page 2 Init Constructor ------------------------");
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
           messagePage2 = "Hello this is page XXX 2";
           return messagePage2;        
       }  
       
    public String addNewDataItem() {
        System.out.println("Invoking AddNew ITEM------------------");
        // Add new MyData item to the data list.
        empList.add(new Employee());
        System.out.println("empList size = "+empList.size());
        addCount.setValue(((Integer) addCount.getValue()) + 1);
        return null; // Postback to same view. You can declare method void as well.
    }

    public String saveNewDataItems() {

        // Do your "UPDATE mydata SET values WHERE id" thing for each new data item.
        try {
            int size = empList.size();
            System.out.println("Save value ขนาดทั้งหมด = "+addCount.getValue());
            //dataDAO.save(dataList.subList(size - ((Integer) addCount.getValue()), size));
        } catch (Exception e) {
        }

        // Reset the amount of newly added items.
        addCount.setValue(0);

        return "list"; // Navigation case.
    }     
    
    public void onEdit(RowEditEvent event) throws Exception {
        System.out.println("onEdit check-------------");    
    }
    public void searchData() throws Exception {
        System.out.println("searchData-------------");
        System.out.println("searchData-------------");   
        System.out.println("searchData-------------");   
    }    
    
    
    public String getMessagePage2() {
        return messagePage2;
    }

    public void setMessagePage2(String messagePage2) {
        this.messagePage2 = messagePage2;
    }

    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }

    public HtmlInputHidden getAddCount() {
        return addCount;
    }

    public void setAddCount(HtmlInputHidden addCount) {
        this.addCount = addCount;
    }
       
}
