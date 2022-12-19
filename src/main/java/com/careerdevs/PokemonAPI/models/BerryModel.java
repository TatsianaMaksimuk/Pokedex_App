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



    private Flavors[] flavors;

        private static class Flavors{


            private int potency;
            private Flavor flavor;

            private static class Flavor{
                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                private String name;


            }

            public int getPotency() {
                return potency;
            }

            public void setPotency(int potency) {
                this.potency = potency;
            }

            public Flavor getFlavor() {
                return flavor;
            }

            public void setFlavor(Flavor flavor) {
                this.flavor = flavor;
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

    public Flavors[] getFlavors() {
        return flavors;
    }

    public void setFlavors(Flavors[] flavors) {
        this.flavors = flavors;
    }
}
