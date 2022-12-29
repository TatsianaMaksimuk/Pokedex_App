package com.careerdevs.PokemonAPI.models;

public class EncounterModel {
    private int id;
    private String name;
    private int order;
    private Names[] names;

    private static class Names {
        private String name;
        private Language language;


        private static class Language {

            private String name;
            public String url;

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


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Language getLanguage() {
            return language;
        }

        public void setLanguage(Language language) {
            this.language = language;
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

    public Names[] getNames() {
        return names;
    }

    public void setNames(Names[] names) {
        this.names = names;
    }

}
