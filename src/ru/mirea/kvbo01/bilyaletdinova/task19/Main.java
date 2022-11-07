package ru.mirea.kvbo01.bilyaletdinova.task19;

import ru.mirea.kvbo01.bilyaletdinova.task10.Student;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int []INNarr=new int[10];
        for (int k=0;k<INNarr.length;k++){
            Random rand =new Random();
            INNarr[k]= rand.nextInt(10000,99999);
        }
        for (int value : INNarr) {
            System.out.println(value);
        }
        try{
            int a=sc.nextInt();
            for(int i :INNarr) {
                if (a != i) {
                    throw new InvalidInnException();
                }
            }
        }catch(Exception e){
            throw new InvalidInnException("ИНН не действителен");
        }

    }
}
