package ru.mirea.kvbo01.bilyaletdinova.avtomat;

public class Main {
    public static int[] prefixfunction(char[] a){
        int[] p =new int[a.length];
        p[0]=0;
        int j=0;
        for(int i=1;i<a.length;i++){
            if(a[i] != a[j]){
                if(j==0){
                    p[i]=0;
                }
                else j=p[j-1];

            }
            else {
                p[i] = j + 1;
                j++;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        int k=0;
        int l=0;

        String a="acvfgh";
        String p="fg";
        int []pi=prefixfunction(p.toCharArray());
        while(k!=a.length() && l!=p.length()){
            if(a.toCharArray()[k]==p.toCharArray()[l]){
                k++;
                l++;
                if(l==p.length()){
                    System.out.println("Образ найден");

                }
            }
            else{
                if(l==0){
                    k++;
                    if(k==a.length()){
                        System.out.println("Образа нет");

                    }
                }
                else l=pi[l-1];
            }
        }
    }
}
