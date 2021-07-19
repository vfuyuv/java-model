package com.jd.jr.java.array;

import java.util.Arrays;

public class ArrNumGeHalf {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        int[] arr = {1, 1};
        int res = arrNumGeHalf(arr);
        System.out.println(res);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime);
        System.out.println("执行时间：" + (endTime - startTime) + "ms");
    }

    public static int arrNumGeHalf(int[] nums) {
        int len = nums.length;
        if (len == 1){
            return nums[0];
        }
        int half = nums.length / 2;
        int num = 1;
        Arrays.sort(nums);
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                num++;
                if (num > half) {
                    return nums[i];
                }
            } else {
                num = 1;
            }
        }
        return 0;
    }

}
