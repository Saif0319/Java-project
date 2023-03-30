package com.example.javaproject;

import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class PlayerTest {
    private Player player;

    @org.junit.Before
    public void setUp() throws Exception {
        player = new Player("cristiano", 38, "portugal");
    }

    @org.junit.Test
    public void setName() {
        player.setName("ronaldo");
        assertEquals("Ronaldo", player.getName());
    }

    @org.junit.Test
    public void setNameInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            player.setName("r0naldo");
        });
    }

    @org.junit.Test
    public void setAge() {
        player.setAge(26);
        assertEquals(26, player.getAge());
    }

    @org.junit.Test
    public void setAgeInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            player.setAge(10);
        });
    }

    @org.junit.Test
    public void setNationality() {
        player.setNationality("portuguesse");
        assertEquals("Portuguesse", player.getNationality());
    }

    @org.junit.Test
    public void testToString() {
        assertEquals("Cristiano - Portugal", player.toString());
    }

/*
    @org.junit.Test
    public void setNameConstructorInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Player pl = new Player("cr", 38, "Portuguesse");
        });
    }

    @org.junit.Test
    public void setNationalityConstructorInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Player pl = new Player("cristiano", 50, "pr");
        });
    }

    @org.junit.Test
    public void setAgeConstructorInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Player pl = new Player("cristiano", 50, "Portuguesse");
        });
    }
    */
}