package org.example.state;

import org.example.GameEngine;

public class End extends Phase {
    public End(GameEngine gameEngine) {
        super(gameEngine);
    }

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
        printInvalidCommandMessage();
    }

    @Override
    public void saveMap() {
        printInvalidCommandMessage();
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
        printInvalidCommandMessage();
    }

    @Override
    public void deploy() {
        printInvalidCommandMessage();
    }

    @Override
    public void endGame() {
        System.out.println("End of game");
    }
}
