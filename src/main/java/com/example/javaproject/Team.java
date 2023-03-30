package com.example.javaproject;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Team {
    private ArrayList<Player> team;

    public Team() {
        this.team = new ArrayList<>();
    }

    /*
    * adds player to the team and will not let the same player be registered more than once
     */
    public void addPlayer(Player player) {

        //if user tries to register the same player twice
        if(this.team.contains(player)) {
            throw new IllegalArgumentException("Player is already registered");
        }

        //if user tries to add the same player with different age or nationality
        for (Player pl : this.team) {
            if(pl.getName().equals(player.getName())) {
                throw new IllegalArgumentException("Player is already in your team");
            }
        }

        this.team.add(player);
    }

    public int numOfPlayers() {
        return this.team.size();
    }

    public boolean playerExists(Player player) {
        return this.team.contains(player);
    }

    public ArrayList<Player> getPlayers() {
        return this.team;
    }


}
