package iterationstatements;

public class forEach
{

    int array []={10,20,30,40,50,60,70};


    public void meth()
    {

        for(int i=0;i<=6;i++)
        {
            System.out.print(array [i] +" ");
        }

        System.out.println();


        for (int i=6;i>=0;i--)
        {

            System.out.print(array [i] +" ");
        }

        System.out.println();

        for( int x: array)
        {
            System.out.print(x +" ");

        }



    }


    public static void main(String[] args) {

        new forEach().meth();

    }
}
