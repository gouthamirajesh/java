//1
//1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

package iterationstatements;

public class star {


    public void meth(){
        int i;

        for (i=1;i<6;i++)
        {

            for (int j=1;j<=i;j++)
            {
                System.out.print(j);
            }

            System.out.println();

        }



    }


    public static void main(String[] args) {

        new star().meth();

    }
}
