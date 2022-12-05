package ru.mirea.kvbo01.bilyaletdinova.task29;

import java.util.Scanner;

public class Main {
    private static final int INF = 9999999;

    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[][] g = new int[length][length];
        int count = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                g[i][j] = scanner.nextInt();
                if(g[i][j]==1){
                    count+=1;
                }

            }
        }
        System.out.println(count/2);
    }
}
