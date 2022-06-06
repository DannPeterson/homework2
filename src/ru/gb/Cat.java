package ru.gb;

public class Cat implements Competing {

    private static final int RUN_LIMIT = 10;
    private static final int JUMP_LIMIT = 1;
    private String name;
    private boolean inRace = true;

    public Cat(String name) {
        this.name = name;
    }

    public boolean isInRace() {
        return inRace;
    }

    @Override
    public boolean run(int distance) {
        boolean result = distance <= RUN_LIMIT;
        if(result) {
            System.out.println("Кот " + name + " пробежал дистанцию");
        } else {
            System.out.println("Кот " + name + " не смог пробежать дистанцию");
            inRace = false;
        }
        return result;
    }

    @Override
    public boolean jump(int distance) {
        boolean result = distance <= JUMP_LIMIT;
        if(result) {
            System.out.println("Кот " + name + " перепрыгнул стену");
        } else {
            System.out.println("Кот " + name + " не смог перепрыгнуть стену");
            inRace = false;
        }
        return result;
    }
}