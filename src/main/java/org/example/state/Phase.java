package org.example.state;

public abstract class Phase {

    // Command common
    public abstract void editContinent();
    public abstract void editCountry();
    public abstract void editNeighbor();

    public abstract void showMap();

    public abstract void saveMap();

    public abstract void editMap();

    public abstract void validateMap();

    public abstract void loadMap();

    public abstract void assigncountries();

    public abstract void deploy();

    public abstract void endGame();

    // methods common to all states
    public void printInvalidCommandMessage() {
        System.out.println("Invalid command in state " + this.getClass().getSimpleName() );
    }
}
