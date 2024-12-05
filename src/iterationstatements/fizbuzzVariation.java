//Write a program that prints the numbers from 1 to 100.
// For multiples of three, print "Fizz" instead of the number, for multiples of five print "Buzz".
// For numbers that are multiples of both three and five, print "FizzBuzz".
// Additionally, for multiples of seven, print "Bazz". Use nested if-else statements to solve this.


package iterationstatements;

public class fizbuzzVariation {

    public void meth(){

        for (int i=1;i<=100;i++)
        {

            if(i%3==0 && i%5==0){

                System.out.println("Fizbuzz");

            }

            if(i%7==0){

                System.out.println("bazz");
            }

            if(i%3==0){
                System.out.println("Fizz");
            }

            else if (i%5==0)
        {
                System.out.println("Buzz");
            }





            else {

                System.out.println(i);
            }

        }


    }

    public static void main(String[] args) {
        new fizbuzzVariation().meth();

    }
}
