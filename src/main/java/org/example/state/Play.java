package org.example.state;

public class Play extends Phase {
    @Override
    public void editContinent() {
        printInvalidCommandMessage();
    }

    @Override
    public void editCountry() {
        printInvalidCommandMessage();
    }

    @Override
    public void editNeighbor() {
        printInvalidCommandMessage();
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
        printInvalidCommandMessage();
    }

    @Override
    public void validateMap() {
        printInvalidCommandMessage();
    }

    @Override
    public void loadMap() {
        printInvalidCommandMessage();
    }

    @Override
    public void assigncountries() {

    }

    @Override
    public void deploy() {

    }
}
