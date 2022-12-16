package com.careerdevs.PokemonAPI.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationModel {

    private int id;
    private String name;
    private Region region;

        private static class Region{
            private String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

        }

    private Areas[] areas;
        private static class Areas{


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

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Areas[] getAreas() {
        return areas;
    }

    public void setAreas(Areas[] areas) {
        this.areas = areas;
    }


}
