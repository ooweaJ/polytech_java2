package com.survivalcoding;

public abstract class TangibleAsset extends Asset implements Thing {
    String name;
    int price;
    String color;

    double weight;

    @Override
    public double GetWeight() {
        return weight;
    }

    @Override
    public void SetWeight(double weight) {
        this.weight = weight;
    }
}
