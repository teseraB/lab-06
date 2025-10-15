package com.example.listycity;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable {
    private String city;
    private String province;

    /**
     * Constructs a City with the specified name and province
     * @param city The name of the city
     * @param province The name of the province
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Gets the city name
     * @return the name of the city
     */
    String getCityName() {
        return this.city;
    }
    /**
     * Gets the province name
     * @return the name of the province
     */
    String getProvinceName() {
        return this.province;
    }

    /**
     * Compares this city to another city based on their names
     * @param o the other City object to compare to
     * @return a negative number if this city's name comes before the other city's name
     *         zero if the names are the same
     *         or a positive number if this city's name comes after the other city's name
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }

    /**
     * Checks if two City objects are equal
     * Two cities are considered equal if they have the same name and province
     * @param o the object to compare with
     * @return true if both the city and province are the same, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City other = (City) o;
        return this.city.equals(other.getCityName()) &&
                this.province.equals(other.getProvinceName());
    }
}

