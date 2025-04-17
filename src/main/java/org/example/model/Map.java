package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Map {
    List<Continent> continents = new ArrayList<>();
    List<Country> countries = new ArrayList<>();

    public List<Continent> getContinents() {
        return continents;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setContinents(List<Continent> continents) {
        this.continents = continents;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    public void addContinent(Continent continent) {}
}
