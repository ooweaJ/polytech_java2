package com.survivalcoding;

public class Cleric {
    final int MaxHp = 50;
    final int MaxMP = 10;

    String name;
    int HP = 50;
    int MP = 10;

    void selfAid() {
        MP -= 5;
        HP = MaxHp;
    }

    int pray(int time) {
        int random = (int) (Math.random() * 2);
        int increment = time + random;

        if (MP + increment > MaxMP) {
            increment = MaxMP - MP;
            MP = MaxMP;
            return increment;
        } else {
            MP += increment;
            return increment;
        }
    }
}
