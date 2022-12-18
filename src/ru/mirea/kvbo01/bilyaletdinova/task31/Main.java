package ru.mirea.kvbo01.bilyaletdinova.task31;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        FileReader fr=new FileReader("C:\\Users\\Airat\\IdeaProjects\\Java\\src\\ru\\mirea\\kvbo01\\bilyaletdinova\\task31");
        BufferedReader bf=new BufferedReader(fr);
        int[] data=new int[4];
        TwoThreeTree<Integer,Integer> ttt=new TwoThreeTree<>();
        for(int k=0;k<4;k++) {
            String u;
            u = bf.readLine();
            char []buf=u.toCharArray();
            int a=Character.getNumericValue(buf[0]);
            data[k]=a;
            ttt.put(a,a);
        }
        ttt.printTree(ttt.depth());

    }
}