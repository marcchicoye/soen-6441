package org.example.utils;

import org.example.model.Continent;
import org.example.model.Country;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;


public class LoadMap {

    public void loadMap(String fileName) {

        List<Continent> continents = new ArrayList<>();
        List<Country> countries = new ArrayList<>();
        String section = "";
        int id = 0;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) {
                    continue;
                }
                if (line.charAt(0) == ';') {
                    continue;
                }

                if (Pattern.matches("^\\[.+\\]$", line)) {
                    section = line.substring(1, line.length() - 1);
                    continue;
                }

                String[] analyzeLine = line.split(" ");

                switch (section) {
                    case "files":
                        break;
                    case "continents":
                        id++;
                        String name = analyzeLine[0];
                        int bonus = Integer.parseInt(analyzeLine[1]);
                        String color = analyzeLine[2];
                        continents.add(new Continent(id,name, bonus, color));

                        break;
                    case "countries":
                        int countryNumber = Integer.parseInt(analyzeLine[0]);
                        String countryName = analyzeLine[1];
                        int continentNumber = Integer.parseInt(analyzeLine[2]);
                        int xCoordinate = Integer.parseInt(analyzeLine[3]);
                        int yCoordinate = Integer.parseInt(analyzeLine[4]);
                        countries.add(new Country(countryNumber, countryName, continentNumber, xCoordinate, yCoordinate));
                        break;
                    case "borders":
//                        System.out.println("[borders]");
                        Country country = null;
                        for(Country c : countries) {
                            if(c.getId() == Integer.parseInt(analyzeLine[0])){
                                country = c;
                                break;
                            }
                        }
                        if(country != null) {
                            for(int x = 1; x < analyzeLine.length; x++) {
                                country.addAdjacentCountryId(Integer.parseInt(analyzeLine[x]));
                            }
                        }
                        break;
                }

//                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file!");
        }

        for (Continent continent : continents) {
            System.out.println(continent);
        }

        for (Country country : countries) {
            System.out.println(country);
        }
    }


}