package com.careerdevs.PokemonAPI.models;

public class PokemonSpeciesModel {
    private int id;
    private String name;
    private int order;
    private int capture_rate;
    private boolean is_legendary;
    private boolean is_mythical;
    private Egg_groups[] egg_groups;
        private static class Egg_groups{
            private int id;
            private String url;
        }

    private String color;

}
