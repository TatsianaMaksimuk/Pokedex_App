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

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }



        }

    private Color color;
        private static class Color{

            private String name;
            private String url;


            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }




        }

   private Evolves_from_species evolves_from_species;
        private static class Evolves_from_species{
            private String name;

            private String url;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
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

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getCapture_rate() {
        return capture_rate;
    }

    public void setCapture_rate(int capture_rate) {
        this.capture_rate = capture_rate;
    }

    public boolean isIs_legendary() {
        return is_legendary;
    }

    public void setIs_legendary(boolean is_legendary) {
        this.is_legendary = is_legendary;
    }

    public boolean isIs_mythical() {
        return is_mythical;
    }

    public void setIs_mythical(boolean is_mythical) {
        this.is_mythical = is_mythical;
    }

    public Egg_groups[] getEgg_groups() {
        return egg_groups;
    }

    public void setEgg_groups(Egg_groups[] egg_groups) {
        this.egg_groups = egg_groups;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Evolves_from_species getEvolves_from_species() {
        return evolves_from_species;
    }

    public void setEvolves_from_species(Evolves_from_species evolves_from_species) {
        this.evolves_from_species = evolves_from_species;
    }


}
