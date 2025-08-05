/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testproject1;

import com.model.Country;
import com.model.hmain_sl4003;
import com.services.CountryService;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.AjaxBehaviorEvent;

@ManagedBean(name="autoCompleteView")
@RequestScoped
public class AutoCompleteView {
    private String txt1;
    private String txt2;
    private String txt3;
    private String txt4;
    private String txt5;
    private String txt6;
    private String txt7;
    private String txt8;
    private String txt9;
    private String txt10;
    private Country country1;
    private Country country2;
    private Country country3;
    private Country country4;
    private Country country5;
    private List<Country> selectedCountries; 
    private hmain_sl4003 hmainSelected;
    
    private CountryService countryService;
    
    public List<String> completeText(String query) {
        String queryLowerCase = query.toLowerCase();
        List<String> countryList = new ArrayList<String>();
        List<Country> countries = countryService.getCountries();
        for (Country country : countries) {
            countryList.add(country.getName());
        }

        return countryList;
    } 
        public List<String> countryList() {   
        ArrayList<String> list = new ArrayList<String>();  
        CountryService countryService = new CountryService();
        list = (ArrayList<String>) countryService.getAllCountries();
        System.out.println("list size = "+list.size());

        return list;  
        }     
     
  public List<String> nameSuggestions(String enteredValue) {
      
      List<String> matches = new ArrayList<String>();
      //using data factory for getting suggestions
        CountryService countryService = new CountryService();
         ArrayList<String> list = new ArrayList<String>(); 
        list = (ArrayList<String>) countryService.getAllCountries();   
        for (int i = 0; i < list.size(); i++) {
              String s = list.get(i).toLowerCase();
            if (s.toLowerCase().startsWith(enteredValue.toLowerCase())) {
                matches.add(s);
             }              
      }

      return matches;
  }   
  
  public List<String> hospitalSuggestions(String enteredValue) {
      
      List<String> matches = new ArrayList<String>();
      List<hmain_sl4003> hmainList = new ArrayList<hmain_sl4003>();
      //using data factory for getting suggestions
        CountryService countryService = new CountryService();
        hmainList =  countryService.getAllHospital();
        for (int i = 0; i < hmainList.size(); i++) {
              String s = hmainList.get(i).getHmain();
              String display = hmainList.get(i).getDisplay();
            if (s.toLowerCase().startsWith(enteredValue.toLowerCase())) {               
                matches.add(display);
             }              
      }

      return matches;
  }    
  public List<hmain_sl4003> hospitalSuggestionsObject(String query) {
      System.out.println("hospitalSuggestionsObject --------");
      System.out.println("query = "+query);
      List<String> matches = new ArrayList<String>();
      List<hmain_sl4003> hmainList = new ArrayList<hmain_sl4003>();
      List<hmain_sl4003> hmainListMatch = new ArrayList<hmain_sl4003>();
       hmain_sl4003 hmianObj = new hmain_sl4003();
      //using data factory for getting suggestions
        CountryService countryService = new CountryService();
        hmainList =  countryService.getAllHospital();
        for (int i = 0; i < hmainList.size(); i++) {
              hmianObj = hmainList.get(i);
              String s = hmainList.get(i).getHmain();
              String display = hmainList.get(i).getDisplay();
            if (s.toLowerCase().startsWith(query.toLowerCase())) {  
                System.out.println("hmainlist Object add match ----"+hmianObj);
                hmainListMatch.add(hmianObj);
             }              
      }
      System.out.println("send back hospitalSuggestionsObject");
      return hmainListMatch;
  }     

  public void action(AjaxBehaviorEvent event){
      System.out.println("invoking Action ---------------");
      String subscriptionId = (String) event.getComponent().getAttributes().get("subscriptionId");
      System.out.println("event.getComponent().getId() = "+event.getComponent().getId()); 
      System.out.println("subscriptionId = "+subscriptionId);
      System.out.println(">>"+event.getComponent().getAttributes().toString());
      
      System.out.println(event.getBehavior().getClass().toString());
      System.out.println(event.toString());
  }
  
  
    public String getTxt1() {
        return txt1;
    }

    public void setTxt1(String txt1) {
        this.txt1 = txt1;
    }

    public hmain_sl4003 getHmainSelected() {
        return hmainSelected;
    }

    public void setHmainSelected(hmain_sl4003 hmainSelected) {
        this.hmainSelected = hmainSelected;
    }
    
    
}
