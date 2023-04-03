package com.example.javaproject;

public class Player {
    private String name;
    private int age;
    private String nationality;

    public Player(String name, int age, String nationality) {
        setName(name);
        setAge(age);
        setNationality(nationality);
    }

    public String getName() {
        return name;
    }

    /*
    * sets the name (trimmed) and forces the first letter to be capitalized
     */
    public void setName(String name) {

        for (char character : name.toCharArray()) {
            if(Character.isDigit(character)) {
                throw new IllegalArgumentException("Name must not contain digits");
            }
        }

        if(name.trim().length() < 2) {
            throw new IllegalArgumentException("Name must be at least 2 characters long");
        }

        String trimmedName = name.trim();
        String capitalized_name = trimmedName.substring(0,1).toUpperCase() + trimmedName.substring(1);
        this.name = capitalized_name;
    }

    public int getAge() {
        return age;
    }

    /*
    * the player can't be older than 47 years old and younger than 17
     */
    public void setAge(int age) {
        if(age > 47 || age < 17) {
            throw new IllegalArgumentException("Players older than 47 or younger than 17 can't be added to your team");
        }

        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    /*
    *Sets nationality (trimmed) and forces first letter to be capitalized, it also cannot be less than 4 characters
     */
    public void setNationality(String nationality) {
        //it must not contain digits
        for (char character : nationality.toCharArray()) {
            if(Character.isDigit(character)) {
                throw new IllegalArgumentException("Nationality must not contain digits");
            }
        }

        if(nationality.trim().length() < 2) {
            throw new IllegalArgumentException("Nationality must be at least 4 characters long");
        }

        String trimmedName = nationality.trim();
        String capitalized = trimmedName.substring(0,1).toUpperCase() + trimmedName.substring(1);
        this.nationality = capitalized;
    }

    @Override
    public String toString() {
        return getName();
    }
}
