/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import java.util.Locale;

/**
 *
 * @author Juckkapun.l
 */
public class Country implements Serializable, Comparable<Country> {
        private int id;
        private String name;
        private String code;
        private Locale locale;
        private boolean rtl;
        
        public Country() {
        }

    public Country(int id, Locale locale) {
        this(id, locale.getDisplayCountry(), locale.getCountry().toLowerCase(), locale);
    }

    public Country(int id, Locale locale, boolean rtl) {
        this(id, locale.getDisplayCountry(), locale.getCountry().toLowerCase(), locale);
        this.rtl = rtl;
    }

    public Country(int id, String name, String code) {
        this(id, name, code, null);
    }

    public Country(int id, String name, String code, Locale locale) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.locale = locale;
    }   
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Country country = (Country) o;
        return true;

    }   

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.id;
        return hash;
    }


    @Override
    public String toString() {
        return name;
    }    
    
    @Override
    public int compareTo(Country o) {
        return name.compareTo(o.name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public boolean isRtl() {
        return rtl;
    }

    public void setRtl(boolean rtl) {
        this.rtl = rtl;
    }
    
    
}
