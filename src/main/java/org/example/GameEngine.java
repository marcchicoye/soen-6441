package org.example;

import org.example.state.Phase;

public class GameEngine {
    private Phase gamePhase;

    public GameEngine(Phase gamePhase) {
        this.gamePhase = gamePhase;
        System.out.println(gamePhase.getClass().getSimpleName());
    }

    public void start() {

    }

}
