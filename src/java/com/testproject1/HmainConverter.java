/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testproject1;

import com.model.hmain_sl4003;
import com.services.CountryService;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Juckkapun.l
 */
@FacesConverter(value = "hmainConverter")
public class HmainConverter implements Converter {
     private CountryService countryService;
    @Override
    public hmain_sl4003 getAsObject(FacesContext context, UIComponent component, String value) {
        if (value != null && value.trim().length() > 0) {
            try {
                System.out.println("[HmainConverter]getAsObject Have value = "+value);
                hmain_sl4003 hmain = new hmain_sl4003("13889", "รพ123", "13889-testชื่อรพ");
                return hmain;
            }
            catch (NumberFormatException e) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid country."));
            }
        }
        else {
            return null;
        }        
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value != null) {
             System.out.println("[HmainConverter]getAsString Have value = "+value);
            return "1115";
        }
        else {
            return null;
        }
    }
    
}
