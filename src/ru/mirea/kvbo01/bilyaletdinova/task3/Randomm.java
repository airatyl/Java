package ru.mirea.kvbo01.bilyaletdinova.task3;

import java.util.Arrays;

public class Randomm {
    public static void main(String[] args) {
        double[] mass = new double[10];
        for (int i = 0; i < 10; i++) {
            mass[i] = Math.random();
        }
        System.out.println(Arrays.toString(mass));
        bubleSort(mass);
        System.out.println(Arrays.toString(mass));

    }
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

}
