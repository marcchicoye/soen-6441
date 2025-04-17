package org.example.state;

import org.example.GameEngine;

public class Play extends Phase {

    public Play(GameEngine gameEngine) {
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

    @Override
    public void endGame() {
        System.out.println("End game");
    }
}
