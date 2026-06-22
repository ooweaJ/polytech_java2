package com.survivalcoding;

public class Computer extends TangibleAsset {
    private String makerName;

    public Computer(String name, int price, String color, double weight, String makerName) {
        super(name, price, color, weight); // 중간 부모 TangibleAsset의 생성자 호출
        this.makerName = makerName;
    }

    public String GetMakerName() {
        return makerName;
    }
}
