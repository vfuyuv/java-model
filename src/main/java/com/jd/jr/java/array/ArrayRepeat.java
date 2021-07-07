package com.jd.jr.java.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayRepeat {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        int[] arr = {2, 3, 1, 0, 2, 5, 3};
//        int res = soreCompare(arr);
//        int res = setHash(arr);
        int res = compare(arr);
        System.out.println(res);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime);
        System.out.println("执行时间：" + (endTime - startTime) + "ms");
    }

    public static Set findRepeatNumber(int[] nums) {
        Set<Integer> repeatNum = new HashSet<>();
        //数组排序
        Arrays.sort(nums);
        //判断邻位是否相等
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                repeatNum.add(nums[i]);
            }
        }
        return repeatNum;
    }

    public static int soreCompare(int[] nums) {
        int len = nums.length;
        if (len == 0 || len == 1) {
            return -1;
        }

        //数组排序
        Arrays.sort(nums);
        //判断邻位是否相等
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return -1;
    }

    public static int setHash(int[] nums) {
        int len = nums.length;
        if (len == 0 || len == 1) {
            return -1;
        }

        //判断set集合中是否存在数字
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
//                System.out.println(nums[i]);
                return nums[i];
            } else {
                set.add(nums[i]);
            }
        }
        return -1;
    }

    public static int compare(int[] nums) {
        int len = nums.length;
        if (len == 0 || len == 1) {
            return -1;
        }

        //冒泡比较每位
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] == nums[j]) {
//                    System.out.println(nums[i]);
                    return nums[i];
                }
            }
        }

        return -1;
    }

}
