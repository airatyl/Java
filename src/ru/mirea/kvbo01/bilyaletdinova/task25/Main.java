package ru.mirea.kvbo01.bilyaletdinova.task25;

import java.util.regex.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Pattern p1 = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher m1 = p1.matcher("fsf");
        System.out.println(m1.matches());
        Pattern p2 = Pattern.compile("\\d\\s?\\+.*");
        Matcher m2 = p2.matcher(sc.next());
        System.out.println(m2.find());


    }
}

