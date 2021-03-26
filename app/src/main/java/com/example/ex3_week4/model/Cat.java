package com.example.ex3_week4.model;

public class Cat {
    private int resourceIMG;
    private String name;

    public Cat(int resourceIMG) {
        this.resourceIMG = resourceIMG;
    }

    public Cat(int resourceIMG, String name) {
        this.resourceIMG = resourceIMG;
        this.name = name;
    }

    public int getResourceIMG() {
        return resourceIMG;
    }

    public void setResourceIMG(int resourceIMG) {
        this.resourceIMG = resourceIMG;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
