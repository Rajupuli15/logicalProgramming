package com.bridgelabs;

import java.util.Scanner;

public class logicalProblems {

    // method for compute the fibonace series
    public static void fibonaceSeries(){
        int a=0,b=1,c,num=10;
        System.out.println(a+" "+b);
        for(int i=2;i<num;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
    //method to check the perfect number
    static long perfect(long number){
        long sum =0;
        for(int i=1;i<=number/2;i++){
            if(number % i == 0){
                sum =sum+i;
            }
        }
        return sum;
    }

    public static void main(String args[]){
        //calling the method in class
        long number1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        number1 = input.nextLong();
        //calling the perfect method and result will be in the result.
        long result = perfect(number1);
        //fibonaceSeries();
        //checking the number is equal to the quotient sum
        if(number1 == result)
            System.out.println(number1+"number perfect number");
        else
            System.out.println(number1+"number not the perfect number");
    }
}

