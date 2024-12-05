// Given an array of integer return the sum of first two elements in the array
//if the array length is less than 2 just sum up the elemets that exists
//retun zero if the array length is zero
// int meth(int []arr)

package arrays;

import java.util.Arrays;

public class array
{

    int r[]={5,5,3};

    public static void main(String[] args)
    {
         array aobj=new array();
         aobj.meth(aobj.r);


    }

    int meth(int []r)
    {
        int x=0;
        for(int i=0;i< r.length;i++)
        {
            x=r[i] +r[++i];
            break;
        }
        System.out.println(Arrays.toString(r));
        System.out.println(x);

        return x;


    }





}
