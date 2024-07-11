package com.company;

import java.util.Scanner;

public class AddAmount
{
    void meth1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter mark value: ");
        int mark=sc.nextInt();

        if (mark%2==0)
            System.out.println("Odd number");
        else
            System.out.println("Even number");
    }
    public static void main(String[] args)
    {
        new AddAmount().meth1();
    }
}
