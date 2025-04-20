package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Country {
    int numberOfArmies;
    String name;
    int idContinent;
    boolean isNeutral;
    int id;
    int xCoordinate;
    int yCoordinate;
    List<Integer> adjacentCountryId;

    public Country(int id, String name, int idContinent,  int xCoordinate, int yCoordinate) {
        this.id = id;
        this.name = name;
        this.idContinent = idContinent;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        adjacentCountryId = new ArrayList<>();

    }

    public int getIdContinent() {
        return idContinent;
    }

    public List<Integer> getAdjacentCountryId() {
        return adjacentCountryId;
    }

    public int getId() {
        return id;
    }

    public void addAdjacentCountryId(int id) {
        adjacentCountryId.add(id);
    }

    @Override
    public String toString() {
        String info = id + " " + name + " " + idContinent + " " + xCoordinate + " " + yCoordinate;
        return info;
    }
}
