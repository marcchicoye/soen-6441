package org.example.state;

public abstract class Edit extends Phase {
    @Override
    public void editContinent() {
        System.out.println("Edit continent");
    }

    @Override
    public void editCountry() {
        System.out.println("Edit country");
    }

    @Override
    public void editNeighbor() {
        System.out.println("Edit neighbor");
    }

    @Override
    public void showMap() {
        System.out.println("Show map");
    }

    @Override
    public void saveMap() {
        System.out.println("Save map");
    }

    @Override
    public void editMap() {
        System.out.println("Edit map");
    }

    @Override
    public void validateMap() {
        System.out.println("Validate map");
    }

    @Override
    public void loadMap() {
        System.out.println("Load map");
    }

    @Override
    public void assigncountries() {
        printInvalidCommandMessage();
    }

    @Override
    public void deploy() {
        printInvalidCommandMessage();
    }
}
