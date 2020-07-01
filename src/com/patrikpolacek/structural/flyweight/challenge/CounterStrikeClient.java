package com.patrikpolacek.structural.flyweight.challenge;

public class CounterStrikeClient {

    public static void main(String[] args) throws Exception {
        PlayerFactory playerFactory = new PlayerFactory();
        for (int i = 0; i < 100; i++) {
            Player counterTerrorist = playerFactory.getPlayerFromFactory("CT");
            Player terrorist = playerFactory.getPlayerFromFactory("T");
            terrorist.setWeapon("AK47");
            counterTerrorist.setWeapon("M15");
            counterTerrorist.mission();
            terrorist.mission();
        }

        System.out.println(playerFactory.getTotalNumberOfObjectsCreated());


    }



}
