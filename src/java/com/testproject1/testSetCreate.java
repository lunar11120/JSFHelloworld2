/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testproject1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Juckkapun.l
 */
public class testSetCreate {
    private static Set<Integer> set1 ;
    
    public static void main(String[] args) {
        System.out.println("TEST SET -------");    
        set1 = new HashSet<Integer>(); 
        
        setOperation();
        addNumberToset(33,20);
        setOperation();
        isNumber_is_OnSet(17);
        isNumber_is_OnSet(85);
        
         DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	 Date date = new Date();
	 System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43

            String ReportName1 = "report XXX :";
            String excelReportName = ReportName1.concat(dateFormat.format(date));
            System.out.println(excelReportName);
           //test export excel simple
            String report_name = "Statement_Vaccine_Covid";
        
    }
    
    public static void setOperation(){

        System.out.println("show SET 1");
        System.out.println(set1.toString());
       
        
    }    
    
    public static void addNumberToset(Integer num1 , Integer num2){
        Integer startNum;
        Integer endNum;
        if(num1 != num2){
                if(num1 > num2){
                  startNum = num2;   endNum = num1;
               }else{
                  startNum = num1;   endNum = num2;
               }

               System.out.println("addNumberToset");
               for (int i = startNum; i <= endNum; i++) {
                   set1.add(i);
                   
                   System.out.println("ADD to set > "+i);
               }         
        }else{
            set1.add(num1);
        }

    }
    
    public static Boolean isNumber_is_OnSet(Integer num1){
        Boolean result ;
        result = set1.contains(num1);
        System.out.println("isNumber_is_OnSet return = "+result);
        return result;
    }    
    
    
  
}
