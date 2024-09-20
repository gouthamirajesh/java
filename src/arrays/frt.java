package arrays;

import java.util.Arrays;

public class frt
{

    public int[] meth1()
    {
        System.out.println("meth1 called");
        int r[]={1,2,3,4};


        return r;
    }

    public  int meth2(int k[])
    {
        System.out.println("meth2 called");

        System.out.println(Arrays.toString(k));

        return k.length;

    }
    public static void main(String[] args)
    {

         frt ro=new frt();
         int ap[]= ro.meth1();
         int e= ro.meth2(ap);
        System.out.println(e);

    }
}
