package org.example.state;

import org.example.GameEngine;

public class PreLoad extends Edit {
    public PreLoad(GameEngine gameEngine) {
        super(gameEngine);
        System.out.println("In PreLoad Phase");
    }
}
