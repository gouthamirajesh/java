package arrays;

import java.util.Arrays;

public class first {

public void meth()
{

    System.out.println("implementating java array ");

    int ar[]={10,20,30};

    int pr[];
    pr=new int[9];

    int kr[]=new int[8];

    int zr[]=new int[]{10,20,30};

    String car=" buji mustang";

    System.out.println("String length is "+ car.length());

    System.out.println(ar.length);

    System.out.println(pr.length);

    System.out.println(kr.length);

    System.out.println(zr.length);



    System.out.println(Arrays.toString(ar));

    pr[5]=10;
    pr[pr.length-1]=20;

    kr[kr.length-1]=20;

    System.out.println(Arrays.toString(pr));

    System.out.println(Arrays.toString(kr));

    System.out.println(Arrays.toString(zr));


    System.out.println("retriving data from an array ");

    System.out.println(ar[1]);
    System.out.println(pr[pr.length-2]);
    System.out.println(kr[kr.length- ar.length]);
    System.out.println(zr[kr.length/8]);





}

    public static void main(String[] args)
    {

        new first().meth();

    }
}
