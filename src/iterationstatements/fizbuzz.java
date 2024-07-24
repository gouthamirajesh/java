// WAP that prints numbers from 1 to 30 for mutiplies of 3 print fiz insated of the number
//for the mutiples of 5 print buzz
//for mutiples of 3 and 5 print printbuzz

package iterationstatements;

public class fizbuzz {


    public void meth(){


        for(int i=1;i<=30;i++)
        {
            while (i%3==0 && i%5==0)
            {

                System.out.println("fizzbuzz");
                i++;  //i=31;

            }
            if (i % 3 == 0)
            {
                System.out.println("fiz");

            }
            else if (i % 5 == 0)
            {

                System.out.println("buzz");


            }

            if (i>30){

                break;


            }
            else{
                System.out.println(i);
            }






        }



    }


    public static void main(String[] args) {

        new fizbuzz().meth();

    }
}
