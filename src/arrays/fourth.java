//Task 3: Reverse Array
//Write a program that reverses the elements of an array.
//
//Requirements:
//
//Take an array as input.
//Reverse the elements and print the reversed array.

package arrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class fourth
{

    public void meth()
    {

        int ar[]={20,50,70,90,100,120};

        int bp[]=new int[ar.length];

        int k= ar.length;


        for(int i=0;i<ar.length;i++)
        {

            bp[k-1]=ar[i];

            --k;



        }

        System.out.println(Arrays.toString(ar));

        System.out.println(Arrays.toString(bp));



    }


    public static void main(String[] args)
    {
        new fourth().meth();

    }

}
