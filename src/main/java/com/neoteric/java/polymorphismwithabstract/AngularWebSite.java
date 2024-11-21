package com.neoteric.java.polymorphismwithabstract;

public abstract class AngularWebSite implements WebSite {

    @Override
    public String header() {
        return "header";
    }

    @Override
    public String footer() {
        return "footer";
    }

    public abstract String body();


    public String page() {
        header();
        body();
        footer();
        return this.getClass().getName();
    }

}