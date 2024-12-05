//WAP to get the o/p by following requirement
//given an int array of length 3, if there is 2  in the  array imediatly followed by 3 then chnage the element 3 into 0
//return the changed array. if there is no 2 in  elements then print it is as it is


package arrays;

import java.util.Arrays;

public class rej
{
    int k[]={2,2,2};
    int r[]=new int[k.length];
    int a;

    public  int[] meth()
    {
        for(int i=0;i< k.length;i++)

        {

            if(k[i]==2&& k[++i]==3 )
            {
                k[i++]=0;

            }

            else
            {
                System.out.println(Arrays.toString(k));

            }
        }



        System.out.println(Arrays.toString(k));

           return k;


    }

    public static void main(String[] args)
    {

        new rej().meth();

    }

}
