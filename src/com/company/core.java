package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class core
{


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a= sc.nextInt();
        int sum=calculateSumOfDigits(a);
        System.out.println("sum of digits is: "+sum);
    }
    private static int calculateSumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int x = n % 10;
            sum += x;
            n /= 10;
        }
        return sum;
    }
}
