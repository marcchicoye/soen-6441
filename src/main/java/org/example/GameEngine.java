package org.example;

import org.example.state.Phase;
import org.example.state.PreLoad;

public class GameEngine {
    private Phase gamePhase;

    public void setGamePhase(Phase gamePhase) {
        this.gamePhase = gamePhase;
//        System.out.println(gamePhase.getClass().getSimpleName());
    }

    public void start() {
        System.out.println("Welcome to Warzone");
        System.out.println();
        this.setGamePhase(new PreLoad(this));
        System.out.println("Let's load map");
        System.out.println("Please provide the map file name");

//        System.out.println("1. Edit mode");
//        System.out.println("2. Play mode");
//        System.out.println("3. Quit");


    }

}
