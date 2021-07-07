package com.jd.jr.java.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayRank {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        int[] arr = {4,1};
        int[] res = indexRank(arr);
        for (int temp : res) {
            System.out.println(temp);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime);
        System.out.println("执行时间：" + (endTime - startTime) + "ms");
    }

    public static int[] rank(int[] nums) {
        List<Integer> oddNums = new ArrayList<>();
        List<Integer> evenNums = new ArrayList<>();

        for (int temp : nums) {
            if (temp % 2 == 0) {
                evenNums.add(temp);
            } else {
                oddNums.add(temp);
            }
        }
        oddNums.addAll(evenNums);
        int[] res = (int[]) oddNums.stream().mapToInt(Integer::valueOf).toArray();
        return res;
    }

    public static int[] indexRank(int[] nums) {
        boolean flag = true;
        int oddIndex = 0;
        int evenIndex = nums.length - 1;
        for (int j = 0; j < nums.length; j++) {
            for (int i = oddIndex; i < evenIndex; i++) {
                if (nums[i] % 2 == 0) {
                    int oddNum = nums[i];
                    oddIndex = i;
                    break;
                }
            }
            for (int i = evenIndex; i > oddIndex; i--) {
                if (nums[i] % 2 == 1) {
                    int evenNum = nums[i];
                    evenIndex = i;
                    break;
                }
            }
            if (flag && (evenIndex - oddIndex) > 0 && oddIndex != 0 && evenIndex != nums.length - 1) {
                int temp = nums[oddIndex];
                nums[oddIndex] = nums[evenIndex];
                nums[evenIndex] = temp;
                oddIndex++;
                evenIndex--;
                flag = false;
            } else {
                break;
            }
        }
        return nums;
    }

    /*public static int[] indexRank(int[] nums) {
        int oddIndex = 0;
        int evenIndex = nums.length;

        for (int i = oddIndex; i < evenIndex; i++) {
            for (int j = evenIndex; j > oddIndex; j++) {

            }
        }
    }*/

}
