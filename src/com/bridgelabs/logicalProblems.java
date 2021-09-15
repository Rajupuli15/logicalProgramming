package com.bridgelabs;

import java.util.Scanner;

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

    //method to check the perfect number
    static long perfect(long number) {
        long sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    //method to check the prime number compute
    static void primeNumber(int num1) {
        int x = num1 / 2;
        boolean flag = false;
        for (int i = 1; i < x; i++) {
            if (num1 % i == 0) {
                System.out.println(num1 + "number is not prime number");
                flag = true;
            } else {
                flag = false;
            }
            if (flag == true) {
                System.out.println(num1 + "number is prime number");
            }
        }
    }
    static void reverseDigit ( int num1){
        int reverse = 0;
        while (num1 != 0) {
            int rem = num1 % 10;
            reverse = reverse * 10 + rem;
            num1 = num1 / 10;
        }
        System.out.println("reverse" + reverse);
    }
    public static void watchTime(){
        long start = System.nanoTime();
        long stop = System.nanoTime();
        System.out.println(start-stop+"elapse watch time");
    }

    public static void main (String args[]){

        Scanner input = new Scanner(System.in);

        watchTime();

    }

}

