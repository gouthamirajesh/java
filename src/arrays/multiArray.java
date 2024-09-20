package arrays;

public class multiArray
{

    public void meth(){

        int ar[][]={{1,2,3,4},{10,20,30,40},{4,5,6,7}};

        for(int i=0;i<=3;i++)

        {

            for(int j=0;j<=3;j++)
            {
                System.out.println(ar[i][j]+ " ");

        }
            System.out.println();


        }
    }


    public static void main(String[] args)

    {
        
        new multiArray().meth();

    }
}
