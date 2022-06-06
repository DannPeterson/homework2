package ru.gb;

public class Main {

    public static void main(String[] args) {
        Competing[] participants = {
                new Human("Man"),
                new Robot("Robo"),
                new Cat("Kitty")
        };

        Obstacle[] obstacles = {
                new Wall(2),
                new RunningTrack(50)
        };

        for (Competing participant : participants) {
            for(Obstacle obstacle : obstacles) {
                if(participant.isInRace()) {
                    if(obstacle.getClass().equals(Wall.class)) {
                        participant.jump(obstacle.getValue());
                    } else {
                        participant.run(obstacle.getValue());
                    }
                }
            }
        }
    }
}