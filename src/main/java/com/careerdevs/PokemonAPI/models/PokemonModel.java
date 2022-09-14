package com.careerdevs.PokemonAPI.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonModel {

    private int id;
    private String name;
    private int base_experience;
    private int height;
    private int weight;

  private Abilities[] abilities;

    public static class Abilities{


        private Ability ability;
        private int slot;
        private boolean is_hidden;

        public static class Ability{


            private String name;
            private String url;

            public String getName() {
                return name;
            }

            public String getUrl() {
                return url;
            }
        }

        public Ability getAbility() {
            return ability;
        }


        public int getSlot() {
            return slot;
        }

        public boolean isIs_hidden() {
            return is_hidden;
        }



    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBase_experience() {
        return base_experience;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public Abilities[] getAbilities() {
        return abilities;
    }

}
