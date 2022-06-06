package ru.gb;

public class RunningTrack implements Obstacle{

    private int distance;

    public RunningTrack(int distance) {
        this.distance = distance;
    }

    @Override
    public int getValue() {
        return distance;
    }
}
