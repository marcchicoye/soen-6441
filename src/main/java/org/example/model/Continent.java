package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    List<Country> countries;
    int id;
    int bonusValue;
    String name;
    String color;

    public Continent(int id, String name, int bonusValue, String color) {
        this.id = id;
        this.name = name;
        this.bonusValue = bonusValue;
        this.color = color;
        countries = new ArrayList<>();
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public void removeCountry(Country country) {
        countries.remove(country);
    }

    public List<Country> getCountries() {
        return countries;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name + " " + bonusValue + " " + color;
    }
}
