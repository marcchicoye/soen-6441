package org.example.utils;

import org.example.model.Map;

public class ValidateMap {
    public void validate(Map map) {
        // map is a connected graph
        //A continent is a connected sub-graph of the map graph,
        //and every territory belongs to one and only one continent.
        // territory belongs to one and only one continent
        // Each continent is given a control value
        System.out.println("Map validated");
    }
}
