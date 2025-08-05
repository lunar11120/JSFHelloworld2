/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;


import com.model.Player;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="playerDataSource")
@SessionScoped
public class PlayerDataSource {
        public List<Player> players = new ArrayList<Player>();

       public PlayerDataSource(){
       // Assumed Player
       Player player = new Player();
       player.setPlayerId("1");
       player.setPlayerName("Anderias Muller");
       player.setPlayerPosition("CF");
       player.setPlayerAge("24");

       // Add Player
       players.add(player); 
       
       
        // Assumed Player
        player = new Player();
        player.setPlayerId("2");
        player.setPlayerName("Olaf Thon");
        player.setPlayerPosition("CM");
        player.setPlayerAge("29");

        // Add Player
        players.add(player);

        // Assumed Player
        player = new Player();
        player.setPlayerId("3");
        player.setPlayerName("Oliver Khan");
        player.setPlayerPosition("GK");
        player.setPlayerAge("31");

        // Add Player
        players.add(player);
        // Assumed Player
       player = new Player();
       player.setPlayerId("4");
       player.setPlayerName("Anderson Reizingaer");
       player.setPlayerPosition("DF");
       player.setPlayerAge("14");

       // Add Player
       players.add(player);     
       
        // Assumed Player
       player = new Player();
       player.setPlayerId("5");
       player.setPlayerName("Oliviara Mnchigit");
       player.setPlayerPosition("CF");
       player.setPlayerAge("10");

       // Add Player
       players.add(player);         
        
        }   
       
        public List<Player> queryByName(String name){
                // Assumed search using the startsWith
                List<Player> queried = new ArrayList<Player>();
                for(Player player: this.players){
                if(player.getPlayerName().startsWith(name)){
                queried.add(player);
                }
                }
                return queried;
        }       

        public void setPlayers(List<Player> players) {
            this.players = players;
        }
       
        public List<Player> getPlayers() {
        return players;
        }      
}
