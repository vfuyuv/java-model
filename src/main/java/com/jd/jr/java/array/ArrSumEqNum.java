package com.jd.jr.java.array;

import java.util.Arrays;

public class ArrSumEqNum {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] res = arrSumEqNum1(arr, target);
        for (int temp : res) {
            System.out.println(temp);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime);
        System.out.println("执行时间：" + (endTime - startTime) + "ms");
    }

    public static int[] arrSumEqNum2(int[] nums, int target) {
//        int index = nums;
        return null;
    }

    public static int[] arrSumEqNum1(int[] nums, int target) {
        int[] res = new int[2];
        for (int temp : nums) {
            for (int temp1 : nums) {
                if (temp + temp1 == target) {
                    res[0] = temp;
                    res[1] = temp1;
                }
            }
        }
        return res;
    }

}
