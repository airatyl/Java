package ru.mirea.kvbo01.bilyaletdinova.task4;

public class Seasons {
    public static void sprint(Season a){
        switch (a){
            case autumn -> System.out.println("я люблю осень");
            case spring -> System.out.println("я люблю весну");
            case summer -> System.out.println("я люблю лето");
            case winter -> System.out.println("я люблю зиму");
        }
    }
    public static void main(String[] args) {
        Season [] arr=Season.values();
        for(int i =0;i<4;i++){
            System.out.println(arr[i]+"\n"+arr[i].getDescription()+"\n"+arr[i].getTemp());
            sprint(arr[i]);
        }
    }
}
