package com.jd.jr.java.array;

import java.util.concurrent.ConcurrentHashMap;

public class ContinuousArrSum {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int res = continuousArrSum(arr);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime);
        System.out.println("执行时间：" + (endTime - startTime) + "ms");
    }

    public static int continuousArrSum(int[] nums) {
        ConcurrentHashMap c = new ConcurrentHashMap();
        int sums = 0;
        int startIndex = 0;
        int endIndex = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            sums = sums + nums[i];
            if (sums >= 0){
                sums = nums[i];
                startIndex = i;
                max = nums[i];
            }
        }
        System.out.println(startIndex + "," + endIndex);
     return 0;
    }

}
