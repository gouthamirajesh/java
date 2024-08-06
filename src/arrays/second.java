package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class second
{
Scanner r=new Scanner(System.in);


public void meth(){

    int ar[]=new int[5];
    String s[] =new String[4];
    boolean b[]=new boolean[3];
    //{1,2,3}

    System.out.println(b[2]);



    System.out.println("please enter "+s.length+" string values");

    for(int i=0;i< s.length;i++)

    {


        s[i]=r.next();



    }

    System.out.println(Arrays.toString(s));


    System.out.println("please enter "+ar.length+" int values");

    for(int i=0;i< ar.length;i++){

        ar[i]=r.nextInt();


    }

    System.out.println(Arrays.toString(ar));


    for(int i= ar.length-1;i>=0;i--)

    {
        System.out.print(ar[i]+" ");
    }

}


public void movieTickets(){

    System.out.println("which movie you want to watch ");

   String s= r.next();

    System.out.println("how many tickets you want idiot");

    int p=r.nextInt();

    System.out.println("enter the names of "+p+"persons ");



    String names[]=new String[p];

      for(int i=0;i<p;i++)
      {

         names[i]= r.next();



      }

    System.out.println(Arrays.toString(names));




}

    public static void main(String[] args)
    {

        //new second().meth();
        new second().movieTickets();

    }
}
