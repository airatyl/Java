package ru.mirea.kvbo01.bilyaletdinova.task2;

public class Main {
    public static void main(String[] args) {
        Author au =new Author("Airat","example@mail.ru",'M');
        System.out.println(au);
        au.setEmail("aaaa@mail.ru");
        System.out.println(au);
        Ball b=new Ball(1,5.5);
        System.out.println(b);
        b.move(2.5,-4);
        System.out.println(b);
    }
}
