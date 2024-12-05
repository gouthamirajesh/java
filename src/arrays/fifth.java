// WAP to reverse a String

package arrays;

import java.util.Arrays;

public class fifth
{

    private void meth()
    {

        String s[]={"rajesh","gouthami","rog","bog","cog"};

        String r[]=new String[s.length];

        int k=s.length-1;


        for(int i=0;i<s.length;i++)
        {
            r[i]=s[k];

            --k;




        }

        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(r));





    }

    public static void main(String[] args)
    {

        new fifth().meth();

    }
}
