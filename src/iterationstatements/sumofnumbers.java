// WAP to print the sum of first hundered natural numbers using for loop
//0+1=1
//1+2=3
//3+3=6
package iterationstatements;

public class sumofnumbers
{

    public void meth(){

        int i;
        int j=0;










        for (i=1;i<=100;i++)
        {

            j=i+j;




        }

        System.out.println(j);
    }

    public static void main(String[] args) {

        new sumofnumbers().meth();

    }
}
