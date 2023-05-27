package org.example;

/* Временная сложность heapify — O(Logn).
   Временная сложность createAndBuildHeap() равна O(n),
   а общее время работы пирамидальной сортировки — O(nLogn).*/

public class HeapSort {

    public void sort(int[] arr) {

        int len = arr.length;

        // строим кучу
        for (int i = len / 2 - 1; i >= 0; i--) {
            heapify(arr, len, i);
        }

        // извлекаем элементы из кучи по порядку
        for (int i = len - 1; i >= 0; i--) {
            // перемещаем текущий корень в конец кучи
             int temp = arr[0];
             arr[0] = arr[i];
             arr[i] = temp;

             // применяем функцию heapify() к уменьшеной куче
            heapify(arr, i, 0);
        }
    }

    // Функция преобразования поддерева с корневым узлом i в двоичную кучу, где i - индекс arr[]
    void heapify(int[] arr, int len, int i) {

        int max = i; // инициализируем наибольший элемент как корень
        int left = 2 * i + 1;// создаем левый росток
        int right = 2* i + 2;// правый росток

        // если левый росток больше корня
        if (left < len && arr[left] > arr[max]) {
            max = left;
        }

        // если правый росток больше текущего максимального элемента
        if (right < len && arr[right] > arr[max]) {
            max = right;
        }

        // если максимальный элемент не является корнем
        if (max != i) {
            int swap = arr[i];
            arr[i] = arr[max];
            arr[max] = swap;

            // рекурсивно преобразуем текущее поддерево в кучу
            heapify(arr, len, max);
        }
    }


}
