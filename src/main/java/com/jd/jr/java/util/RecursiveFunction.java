package com.jd.jr.java.util;

/**
 * 递归函数
 */
public class RecursiveFunction {

    public static void main(String[] args) {
        incrWordNumStart();//每天记单词，第一天记1个，第二天记2个依次类推。第10天开始的时候会了多少个单词？
        FactorialStart();//阶乘
        FibonacciStart();//斐波那契
    }

    //递增
    public static void incrWordNumStart() {
        int num = incrWordNum(5);
        System.out.println(num);
    }

    public static int incrWordNum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return incrWordNum(n - 1) + n;
        }
    }

    //阶乘
    public static void FactorialStart() {
        int num = Factorial(5);
        System.out.println(num);
    }

    public static int Factorial(int n) {
        if (n < 0) {
            return 0;
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            return Factorial(n - 1) * n;
        }
    }

    //斐波那契
    public static void FibonacciStart() {
        int num = Fibonacci(6);
        System.out.println(num);
    }

    public static int Fibonacci(int n) {
        if (n < 0) {
            return 0;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
}
