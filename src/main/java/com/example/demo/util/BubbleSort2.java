package com.example.demo.util;

public class BubbleSort2 {

    public void bubbleSort(Integer[] arr, int n) {
        if (n <= 1) {
            return;
        }
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                flag = true;
            }
            if (!flag){
                break;
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {2,5,6,9,4,3,7,8};
        BubbleSort2 bubbleSort2 = new BubbleSort2();
        bubbleSort2.bubbleSort(arr,arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
