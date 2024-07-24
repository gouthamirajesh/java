//Task 9: Leap Year Checker
//        Write a Java program that takes a year as input from the user and checks if it is a leap year.
//        A year is a leap year if it is divisible by 4, but not divisible by 100, unless it is also divisible by 400. Print the result.

package controllstatements;

public class leapYear {


    public void meth(int a){
       if(a%4==0){

           System.out.println("it is a leap year");


       }

       else {
           System.out.println("it is not a leap year");
       }






    }


    public static void main(String[] args) {

        new leapYear().meth(1978);

    }
}
