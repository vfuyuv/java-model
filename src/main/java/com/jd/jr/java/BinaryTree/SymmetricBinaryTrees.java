package com.jd.jr.java.BinaryTree;

import com.jd.jr.java.util.TreeNode;

public class SymmetricBinaryTrees {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
//        boolean res = isSymmetric(arr);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime);
        System.out.println("执行时间：" + (endTime - startTime) + "ms");
    }

    public static boolean isSymmetric(TreeNode root) {
        return root == null ? true: symmetric(root.getLeft(),root.getRight());
    }

    public static boolean symmetric(TreeNode L, TreeNode R) {
        if (L == null && R == null) {
            return true;
        }
        if (L == null || R == null || L.getVal() != R.getVal()) {
            return false;
        }
        return symmetric(L.getLeft(),R.getRight()) && symmetric(L.getRight(),R.getLeft());
    }

}
