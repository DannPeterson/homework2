package ru.gb;

public class Robot implements Competing {

    private static final int RUN_LIMIT = 1000;
    private static final int JUMP_LIMIT = 20;
    private String name;
    private boolean inRace = true;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public boolean isInRace() {
        return inRace;
    }

    @Override
    public boolean run(int distance) {
        boolean result = distance <= RUN_LIMIT;
        if(result) {
            System.out.println("Робот " + name + " пробежал дистанцию");
        } else {
            System.out.println("Робот " + name + " не смог пробежать дистанцию");
            inRace = false;
        }
        return result;
    }

    @Override
    public boolean jump(int distance) {
        boolean result = distance <= JUMP_LIMIT;
        if(result) {
            System.out.println("Робот " + name + " перепрыгнул стену");
        } else {
            System.out.println("Робот " + name + " не смог перепрыгнуть стену");
            inRace = false;
        }
        return result;
    }
}