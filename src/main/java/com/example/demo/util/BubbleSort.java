package com.example.demo.util;

public class BubbleSort {

    public void bubbleSort(Integer[] arr, int n) {
        if (n <= 1) return;

        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }

    public static void main(String[] args) {
        Integer arr[] = {2,4,7,6,8,5,9};
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arr,arr.length);
        for (int j = 0;j<arr.length;j++){
            System.out.print(arr[j]);
        }
    }
}
