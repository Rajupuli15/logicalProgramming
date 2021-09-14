package com.bridgelabs;

public class logicalProblems {

    // method for compute the fibonace series
    public static void fibonaceSeries() {
        int a = 0, b = 1, c, num = 10;
        System.out.println(a + " " + b);
        for (int i = 2; i < num; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }

    public static void main(String args[]) {
        //calling the method in class
        fibonaceSeries();
    }
}

