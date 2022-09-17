package ru.mirea.kvbo01.bilyaletdinova.task3;

import ru.mirea.kvbo01.bilyaletdinova.task4.Seasons;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Random();
        Shell();
    }
    //задание 1 на Math и Random
    public static void bubleSort(double []mass){
        for (int j = 0; j < mass.length-1; j++) {
            for (int j1 = mass.length-1; j1 > j; j1--) {
                if (mass[j1 ]<mass[j1-1]){
                    double a=mass[j1-1];
                    mass[j1-1]=mass[j1];
                    mass[j1]=a;
                }
            }
        }
    }
    public static void Random(){
        double[] mass = new double[10];
        for (int i = 0; i < 10; i++) {
            mass[i] = Math.random();
        }
        System.out.println(Arrays.toString(mass));
        bubleSort(mass);
        System.out.println(Arrays.toString(mass));
    }
    //задание 1 на классы Оболочки
    public static void Shell(){
        Double d= Double.valueOf(12.5);
        double d1=Double.parseDouble("123");
        String s= d.toString();
        int i=d.intValue();
        System.out.println(d);
        String s1=Double.toString(3.14);
        System.out.println(s1);
    }


}
