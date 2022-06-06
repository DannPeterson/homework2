package ru.gb;

public class Human implements Competing {

    private static final int RUN_LIMIT = 100;
    private static final int JUMP_LIMIT = 3;
    private String name;
    private boolean inRace = true;

    public Human(String name) {
        this.name = name;
    }

    public boolean isInRace() {
        return inRace;
    }

    @Override
    public boolean run(int distance) {
        boolean result = distance <= RUN_LIMIT;
        if(result) {
            System.out.println("Человек " + name + " пробежал дистанцию");
        } else {
            System.out.println("Человек " + name + " не смог пробежать дистанцию");
            inRace = false;
        }
        return result;
    }

    @Override
    public boolean jump(int distance) {
        boolean result = distance <= JUMP_LIMIT;
        if(result) {
            System.out.println("Человек " + name + " перепрыгнул стену");
        } else {
            System.out.println("Человек " + name + " не смог перепрыгнуть стену");
            inRace = false;
        }
        return result;
    }
}