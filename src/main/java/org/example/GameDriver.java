package org.example;

import org.example.model.Game;
import org.example.model.Map;
import org.example.utils.LoadMap;
import org.example.utils.SaveMap;

public class GameDriver {
    public static void main(String[] args) {
//        GameEngine gameEngine = new GameEngine();
//        gameEngine.start();
        LoadMap loadMap = new LoadMap();
        Map map = loadMap.loadMap("/Users/marcchicoye/Documents/Concordia/SOEN-6441/Project/mywarzone/dominationMaps/europe.map");

        SaveMap saveMap = new SaveMap();
        saveMap.save(map, "toto");
    }
}
