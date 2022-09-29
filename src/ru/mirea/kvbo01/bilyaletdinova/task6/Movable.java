package ru.mirea.kvbo01.bilyaletdinova.task6;

public interface Movable {
    public void moveUp();

    public void moveDown();

    public void moveRight();

    public void moveLeft();
    static void print1(Movable c){
        System.out.println(c.toString());
    }

}

