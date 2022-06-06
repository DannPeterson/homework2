package ru.gb;

public class Wall implements Obstacle{

    public int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int getValue() {
        return height;
    }
}