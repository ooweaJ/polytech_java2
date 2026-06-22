package com.survivalcoding;

public abstract class Asset {
    private String name;

    public Asset(String name) {
        this.name = name;
    }

    public String GetName() {
        return name;
    }
}
