package com.survivalcoding;

enum KeyType {
    PADLOCK,
    BUTTON,
    DIAL,
    FINGER
}

public class StrongBox<E> {
    private E data;
    private int limit;
    private int count = 0;
    private KeyType keyType;

    public StrongBox(KeyType keyType) {
        switch (keyType) {
            case PADLOCK -> this.limit = 1024;
            case BUTTON -> this.limit = 10000;
            case DIAL -> this.limit = 30000;
            case FINGER -> this.limit = 1000000;
        }
    }

    public void put(E data) {
        this.data = data;
    }
    
    public E get() {
        count++;
        if (count < limit) {
            return null;
        }
        return this.data;
    }
}
