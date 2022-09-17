package ru.mirea.kvbo01.bilyaletdinova.task1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println(fact(0));
        //номер 3
        Scanner sc=new Scanner(System.in);
        int []arr=new int[10];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        double arf=sum/arr.length;
        System.out.println(sum+"\n"+arf);

    }
    //номер 7
    public static int fact(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact*=i;
        }
        return fact;
    }
}
