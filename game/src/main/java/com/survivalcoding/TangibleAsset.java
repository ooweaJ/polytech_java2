package com.survivalcoding;

public abstract class TangibleAsset extends Asset implements Thing {
    private String color;
    private double weight;
    private int price;

    public TangibleAsset(String name, int price, String color, double weight) {
        super(name); // 최상위 부모 Asset의 생성자 호출
        this.price = price;
        this.color = color;
        this.weight = weight;
    }

    public String GetColor() {
        return color;
    }

    public int Getprice() {
        return price;
    }

    @Override
    public double GetWeight() {
        return weight;
    }

    @Override
    public void SetWeight(double weight) {
        this.weight = weight;
    }
}
