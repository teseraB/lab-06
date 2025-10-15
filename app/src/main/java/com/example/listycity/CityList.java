package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();
    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * Checks whether a given city exists in the list
     * @param city the City object to check
     * @return true if the city exists, false otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Deletes a city from the list
     * If the city does not exist, throws an IllegalArgumentException
     * @param city the City object to remove
     * @throws IllegalArgumentException if the city does not exist in the list
     */
    public void delete(City city) {
        if (!hasCity(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * Returns how many cities are currently in the list
     * @return the number of cities
     */
    public int countCities() {
        return cities.size();
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
}
