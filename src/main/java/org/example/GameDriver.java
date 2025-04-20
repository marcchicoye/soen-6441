package org.example;

import org.example.model.Game;
import org.example.model.Map;
import org.example.utils.LoadMap;
import org.example.utils.SaveMap;
import org.example.utils.ValidateMap;

public class GameDriver {
    public static void main(String[] args) {
//        GameEngine gameEngine = new GameEngine();
//        gameEngine.start();
        LoadMap loadMap = new LoadMap();
        Map map = loadMap.loadMap("/Users/marcchicoye/Documents/Concordia/SOEN-6441/Project/mywarzone/dominationMaps/invalidMap/europe.map");
//
        ValidateMap validateMap = new ValidateMap();
        if(validateMap.isMapValid(map)) {
            System.out.println("Map is valid");
        } else {
            System.out.println("Map is not valid");
        }

//        SaveMap saveMap = new SaveMap();
//        saveMap.save(map, "toto");
    }
}
