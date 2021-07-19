package com.jd.jr.java.array;

import java.util.*;

public class ArrOnlyOne {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        //[2,4,4,9,9,11]
        //[2,3,4,9,9,11]
        //[2,4,4,9,10,11]
        //[2,3,4,9,10,11]
        int[] arr = {6,5,5,9,10,9,4,10};
        int[] res = findOnlyNum(arr);
        for (int temp : res) {
            System.out.println(temp);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime);
        System.out.println("执行时间：" + (endTime - startTime) + "ms");
    }

    //[2,4,4,9,9,11]
    //[2,3,4,9,9,11]
    //[2,4,4,9,10,11]
    //[2,3,4,9,10,11]

    public static int[] findOnlyOne(int[] nums) {
        //数组排序
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        int val = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                if (val != nums[i]) {
                    set.add(nums[i]);
                } else {
                    if (i == nums.length - 2){
                        set.add(nums[i + 1]);
                    }
                    if (i != nums.length - 2 && nums[i + 1] != nums[i + 2]) {
                        set.add(nums[i + 1]);
                    }
                }
            } else {
                val = nums[i];
            }
        }
        int[] res = set.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }

    //[2,4,4,9,9,11]
    //[2,3,4,9,9,11]
    //[2,4,4,9,10,11]
    //[2,3,4,9,10,11]

    public static int[] findOnlyNum(int[] nums) {
        //数组排序
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        int val = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i == nums.length - 2){
                if (nums[i] != nums[i + 1]){
                    set.add(nums[i + 1]);
                }
            }else {
                if (nums[i] != nums[i + 1]){
                    if (val != nums[i]){
                        set.add(nums[i]);
                    }else {
                        if (i != nums.length - 2 && nums[i + 1] != nums[i + 2]) {
                            set.add(nums[i + 1]);
                        }
                    }
                }else {
                    val = nums[i];
                }
            }
        }
        int[] res = set.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }

}
