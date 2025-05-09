package org.example.state;

import org.example.GameEngine;

public class PostLoad extends Edit{
    public PostLoad(GameEngine gameEngine) {
        super(gameEngine);
        System.out.println("In postLoad");
    }

    @Override
    public void nextStage() {
        gameEngine.setGamePhase(new Play(gameEngine));
    }
}
