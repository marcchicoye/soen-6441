package org.example.utils;

import org.example.model.Continent;
import org.example.model.Country;
import org.example.model.Map;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class SaveMap {
    public void save(Map map, String fileName) {

        if(fileName.contains(".map")) {
            fileName = fileName.replace(".map", "");
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))){
            int index = 1;

            writer.write("[files]" + System.lineSeparator());
            writer.write(System.lineSeparator());

            writer.append("[continents]").append(System.lineSeparator());
            for(Continent continent : map.getContinents()) {
                writer.append(continent.toString()).append(System.lineSeparator());
                index++;
            }
            writer.write(System.lineSeparator());

            writer.append("[countries]").append(System.lineSeparator());
            for(Country country: map.getCountries()) {
                writer.append(country.toString()).append(System.lineSeparator());
            }
            writer.write(System.lineSeparator());

            writer.append("[borders]").append(System.lineSeparator());
            index = 0;
            for(Country country: map.getCountries()) {
                index++;
                List<Integer> adjacentId = country.getAdjacentCountryId();
                writer.append(index + "");

                for(Integer id : adjacentId) {
                    writer.append(" ").append(id.toString());
                }
                writer.append(System.lineSeparator());
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        System.out.println("Map saved");


    }
}
