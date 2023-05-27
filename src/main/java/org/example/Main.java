package org.example;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 8, 5, 35, 34, 53, 85, 11, 0, 6, 23, 8, 22, 7, 4, 43};

        System.out.println("Изначальный массив: ");
        printArray(arr);
        System.out.println();

        HeapSort obj = new HeapSort();
        obj.sort(arr);

        System.out.println("Отсортированный массив: ");
        printArray(arr);
    }

    // функция вывода массива
    static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}

