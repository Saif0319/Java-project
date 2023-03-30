package com.example.javaproject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TeamTest {
    private Team club;
    @Before
    public void setUp() throws Exception {
        club = new Team();
    }

    @Test
    public void addPlayer() {
        Player pl1 = new Player("Ceballos", 26, "Spanish", "");
        club.addPlayer(pl1);

        assertEquals(true, club.getPlayers().contains(pl1));
    }

    @Test
    public void playerExists() {
        Player pl1 = new Player("Ceballos", 26, "Spanish", "");
        club.addPlayer(pl1);

        assertEquals(true, club.playerExists(pl1));
    }

    @Test
    public void playerDoesNotExist() {
        Player pl1 = new Player("Ceballos", 26, "Spanish", "");
        Player pl2 = new Player("Cristiano", 38, "Portuguesse", "");
        club.addPlayer(pl1);

        assertEquals(false, club.playerExists(pl2));
    }

    @Test
    public void numOfPlayers() {
        Player pl1 = new Player("Modric", 37, "Croatian", "");
        Player pl2 = new Player("Kroos", 33, "German", "");
        club.addPlayer(pl1);
        club.addPlayer(pl2);

        assertEquals(2, club.numOfPlayers());
    }
}