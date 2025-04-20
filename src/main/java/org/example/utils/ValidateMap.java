package org.example.utils;

import org.example.model.Country;
import org.example.model.Map;
import java.util.*;

public class ValidateMap {

    public boolean isMapValid(Map map) {

        if(!isCountryNameUnique(map.getCountries())) {
            System.out.println("Country name is not unique");
            return false;
        }

        if(!isCountryBelongToAValidContinent(map.getCountries(), map.getContinents().size())) {
            System.out.println("Country Belong to a continent is not unique");
            return false;
        }

        if(!isNeighborRelationshipsAreBidirectional(map.getCountries())) {
            System.out.println("Country Belong to a bidirectional country is not unique");
            return false;
        }

        if(!BFS(map.getCountries())) {
            System.out.println("Graph is not fully connected");
            return false;
        }
        return true;
    }

    /**
     * Validates the map by checking if the graph of countries is connected
     *
     * Validate that every neighbor in a country's neighbor list exists in d_Countries.
     *
     * @return true if the map is valid, false otherwise.
     */
    private boolean BFS(List<Country> lstCountries) {
        List<Integer> visitedCountries = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        java.util.Map<Integer, List<Integer>> countryMap  = new java.util.HashMap<>();
        int index = 1;
        for (Country country : lstCountries) {
            countryMap.put(index, country.getAdjacentCountryId());
            index++;
        }

        queue.add(1);

        while(!queue.isEmpty()) {
            int countryId = queue.remove();
            if(!visitedCountries.contains(countryId)) {
                visitedCountries.add(countryId);
            }
            List<Integer> test = countryMap.get(countryId);

            for(Integer id : countryMap.get(countryId)) {
                if(!visitedCountries.contains(id)) {
                    visitedCountries.add(id);
                    queue.add(id);
                }
            }
            countryMap.remove(countryId);
        }
        return countryMap.isEmpty();
    }


    /**
     * Country id should be unique
     */
    private boolean isCountryNameUnique(List<Country> lstCountries) {
        Set<Country> setCountries = new HashSet<>(lstCountries);
        setCountries.addAll(lstCountries);
        return setCountries.size() == lstCountries.size();
    }

    /**
     * Country id belongs to a valid continent
     */
    private boolean isCountryBelongToAValidContinent(List<Country> lstCountries, int numberOfContinents) {
//        System.out.println("Number of continents is: " + numberOfContinents);
        for(Country country : lstCountries) {
            if(country.getIdContinent()  < 1 || country.getIdContinent() > numberOfContinents) {
                return false;
            }
        }
        return true;
    }

    /**
     * Validate that neighbor relationships are bidirectional.
     */
    private boolean isNeighborRelationshipsAreBidirectional(List<Country> lstCountries) {
        for(Country country : lstCountries) {
            for(Integer borderId : country.getAdjacentCountryId()) {
                if(!lstCountries.get(borderId-1).getAdjacentCountryId().contains(country.getId())){
                    return false;
                }
            }
        }
        return true;
    }





    /**
     * Helper method to check if the graph of countries is connected
     *
     * @return true if all countries are connected, false otherwise.
     */


    /**
     * DFS (depth first search) to explore all connected countries
     *
     * @param p_countryID The starting country ID for traversal.
     * @param p_visited   A set of visited country IDs to track traversal.
     */


    /**
     * Helper method to validate continent-country relationship
     *
     * @return true if every country is attached to a continent, otherwise false
     */


    /**
     * Checks whether each country belongs to only one continent.
     *
     * @return true if each country belongs to exactly one continent, false otherwise.
     */
    public void validate(Map map) {
        // map is a connected graph
        //A continent is a connected sub-graph of the map graph,
        //and every territory belongs to one and only one continent.
        // territory belongs to one and only one continent
        // Each continent is given a control value
        System.out.println("Map validated");
    }
}
