package ru.mirea.kvbo01.bilyaletdinova.task24;

public class Main {
    public static void main(String[] args) {
        AbstractChairFactory creater = new AbstractChairFactory();
        Chair chair = creater.createVictoriaChair(2);
        Client a = new Client();
        a.setChair(chair);
        a.sit();

    }
}
