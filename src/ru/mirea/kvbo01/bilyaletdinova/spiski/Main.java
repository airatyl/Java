package ru.mirea.kvbo01.bilyaletdinova.spiski;

public class Main {
    public static void sort(MyLinkedList a) {

        for (int k = 1; k <= a.size(); k++) {
            int ind=k;
            String b = a.get(k).toString();
            for (int i = k+1; i <= a.size(); i++) {
                if (b.compareTo(a.get(i).toString()) > 0) {
                    b = a.get(i).toString();
                    ind=i;
                }
            }
            a.remove(ind);
            a.add(b,k);
        }
    }
    public static void main(String[] args) {
        MyLinkedList a=new MyLinkedList();

        a.add("fdadas");
        a.add("daasdadas");
        a.add("cesdadas");
        a.add("evvsdadas");
        a.add("bbbsdadas");
        a.add("ababsdadas");
        System.out.println(a.toString());
        sort(a);
        System.out.println(a.toString());
    }
}
