/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.model.Country;
import com.model.hmain_sl4003;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;

@ApplicationScoped
public class CountryService {
    private List<Country> countries;
    private Map<Integer, Country> countriesAsMap;
    private List<Country> locales;
    private Map<Integer, Country> localesAsMap;

    @PostConstruct
    public void init() {
        countries = new ArrayList<Country>();
        locales = new ArrayList<Country>();

        String[] isoCodes = Locale.getISOCountries();

        for (int i = 0; i < isoCodes.length; i++) {
            Locale locale = new Locale("", isoCodes[i]);
            countries.add(new Country(i, locale));
        }  
        
       //Collections.sort(countries, (Country c1, Country c2) -> c1.getName().compareTo(c2.getName()));

        int i = 0;
        locales.add(new Country(i++, Locale.US));
        locales.add(new Country(i++, Locale.FRANCE));
        locales.add(new Country(i++, Locale.GERMANY));
        locales.add(new Country(i++, Locale.ITALY));
        locales.add(new Country(i++, Locale.KOREA));
        locales.add(new Country(i++, new Locale("es", "ES")));
        locales.add(new Country(i++, new Locale("ca", "ES")));
        locales.add(new Country(i++, new Locale("nl", "NL")));
        locales.add(new Country(i++, new Locale("pt", "BR")));
        locales.add(new Country(i++, new Locale("pt", "PT")));
        locales.add(new Country(i++, new Locale("ar", "SA"), true));
        locales.add(new Country(i++, new Locale("cs", "CZ")));
        locales.add(new Country(i++, new Locale("el", "GR")));   
        locales.add(new Country(i++, new Locale("sv", "SE")));
        locales.add(new Country(i++, new Locale("tr", "TR")));
        locales.add(new Country(i++, new Locale("uk", "UA")));
        locales.add(new Country(i++, new Locale("vi", "VN")));
        locales.add(new Country(i++, Locale.SIMPLIFIED_CHINESE));
        locales.add(new Country(i++, Locale.TRADITIONAL_CHINESE));        
    } 
    
    public List<String> getAllCountries() {
        System.out.println("[service] call getAllCountries");
        List<String> list = new ArrayList<String>();
        list.add("India");  
        list.add("Thailand"); 
        list.add("Togo"); 
        list.add("cambodia");
        list.add("Vietnam");
        list.add("Australia"); 
        list.add("Angolar");
        list.add("Albania");
        list.add("Alba");
        list.add("Germany");  
        list.add("Italy");  
        list.add("United States");  
        list.add("Russia");  
        list.add("Russia2");
        list.add("Russia3");
        list.add("Russia4");
        list.add("usa");
        list.add("usa arizona");
        list.add("usa 111111");        
        return list;
    }     
    
    public List<hmain_sl4003> getAllHospital() {
        System.out.println("[service] call getAllHospital");
        List<hmain_sl4003> hmainList = new ArrayList<hmain_sl4003>();
        hmain_sl4003 h1 = new hmain_sl4003("20056", "คลินิกหมอสวนดอกแม่เหียะเวชกรรม", "20056-คลินิกหมอสวนดอกแม่เหียะเวชกรรม");
        hmain_sl4003 h2 = new hmain_sl4003("20057", "สมิทธ์คลินิกเวชกรรม", "20057-สมิทธ์คลินิกเวชกรรม");
        hmain_sl4003 h3 = new hmain_sl4003("20058", "คลินิกเวชกรรมบริการปฐมภูมิป่าตัน", "20058-คลินิกเวชกรรมบริการปฐมภูมิป่าตัน");
        hmain_sl4003 h4 = new hmain_sl4003("00534", "สสอ.แม่แตง", "00534-สสอ.แม่แตง");
        hmain_sl4003 h5 = new hmain_sl4003("00535", "สสอ.แม่ริม", "00534-สสอ.แม่ริม");
        hmain_sl4003 h6 = new hmain_sl4003("00536", "สสอ.แม่ละม้าย", "00536-สสอ.แม่ละม้าย");
        hmain_sl4003 h7 = new hmain_sl4003("00537", "สสอ.แม่แตงอ่อน", "00536-สสอ.แม่แตงอ่อน");
        hmainList.add(h1);
        hmainList.add(h2);
        hmainList.add(h3);
        hmainList.add(h4);
        hmainList.add(h5);
        hmainList.add(h6);
        hmainList.add(h7);
                
        return hmainList;
    }       
    
    public List<Country> getCountries() {
        return new ArrayList<Country>(countries);
    }    
}
