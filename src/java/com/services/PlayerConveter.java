/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.model.Player;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;


//To be considered by the JavaServer Faces As Managed Bean
// & Make the converter Eligible for use @ManagedProperty
@ManagedBean(name="playerConverter")
@RequestScoped
@FacesConverter
public class PlayerConveter  implements Converter {
    private static final long serialVersionUID = -1;

    private PlayerDataSource ds;

    public PlayerDataSource getDs() {
        return ds;
    }

    public void setDs(PlayerDataSource ds) {
        this.ds = ds;
    }
    
    
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        System.out.println("[playerConverter] getAsObject ----------");
        PlayerDataSource playerDataSource = new PlayerDataSource();
        for(Player p : playerDataSource.getPlayers()){
                if(p.getPlayerId().equals(value)){
                return p;
                 }
        }
        return null;
    }

    public String getAsString(FacesContext context, UIComponent component, Object value) {
         System.out.println("[playerConverter] getAsString  String ----------");
        if(value instanceof Player){
            Player player = (Player)value;
            return player.getPlayerId();
        }
       return "";      
    }
    
}
