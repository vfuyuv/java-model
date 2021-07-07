package com.jd.jr.java.util;

public class SortALG {

    public static int[] BubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int aaa : arr) {
            System.out.print(aaa);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 0, 2, 5, 3};
        int[] res = BubbleSort(arr);
        System.out.println();
        for (int temp : res) {
            System.out.print(temp);
        }
    }
}
