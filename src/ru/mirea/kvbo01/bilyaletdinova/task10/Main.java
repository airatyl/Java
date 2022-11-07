package ru.mirea.kvbo01.bilyaletdinova.task10;

import java.util.Comparator;
import java.util.Random;

public class Main {
    Random rand = new Random();

    public static void setArray(Student[] a) {
        Random rand = new Random();
        for (int k = 0; k < a.length; k++) {
            a[k] = new Student(rand.nextInt(-5, 5));

        }
    }


    static int partition(Student[] arr, int low, int high) {

        Comparator<Student> comp = new StudentScoreComparator().thenComparing(new StudentNameComparator());
        Student pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (comp.compare(arr[j], pivot) == -1) {
                i++;
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        Student temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return (i + 1);
    }

    static void quickStudentSort(Student[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickStudentSort(arr, low, pi - 1);
            quickStudentSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        Student[] iDNumber = new Student[10];
        setArray(iDNumber);
        for (Student value : iDNumber) {
            System.out.println(value);
        }
        System.out.println();
        quickStudentSort(iDNumber, 0, 9);
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }
}