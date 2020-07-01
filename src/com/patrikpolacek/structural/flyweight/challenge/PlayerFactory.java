package com.patrikpolacek.structural.flyweight.challenge;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {
    Map<String, Player> playerMap = new HashMap<>();

    public int getTotalNumberOfObjectsCreated(){
        return playerMap.size();
    }

    public Player getPlayerFromFactory(String name) throws Exception {
        Player playerForReturn = null;

        if (playerMap.containsKey(name)){
            playerForReturn = playerMap.get(name);
            return playerForReturn;
        }else {
            switch (name){
                case "T":
                    System.out.println("We don't have terrorist yet, creating terrorist player character.");
                    playerForReturn = new Terrorist();
                    playerMap.put("T", playerForReturn);
                    break;
                case "CT":
                    System.out.println("We don't have CT yet, creating CT player character.");
                    playerForReturn = new CounterTerrorist();
                    playerMap.put("CT", playerForReturn);
                    break;
            }
        }
        return playerForReturn;
    }

}
