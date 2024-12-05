//Write a program that prints the multiplication table for a given number.
// The number should be taken as input from the user.

package controllstatements;

import java.util.Scanner;

public class multiplicationTable
{
     Scanner rg =new Scanner(System.in);


     public void meth()
     {

         System.out.println("enter the number of which table you want ");




         int b=rg.nextInt();



         for(int i=1;i<=20;i++)

         {
             System.out.println(b+"*"+i +"="+b*i);




         }
     }


    public static void main(String[] args)
    {
        new multiplicationTable().meth();

    }

}
