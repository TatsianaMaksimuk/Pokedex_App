package com.careerdevs.PokemonAPI.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BerryModel {
    private int id;



    private String name;
    private int growth_time;
    private int size;
    public Firmness firmness;
        public static class Firmness{

            private String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrowth_time() {
        return growth_time;
    }

    public void setGrowth_time(int growth_time) {
        this.growth_time = growth_time;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Firmness getFirmness() {
        return firmness;
    }

    public void setFirmness(Firmness firmness) {
        this.firmness = firmness;
    }

}
