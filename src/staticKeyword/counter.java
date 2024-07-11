package staticKeyword;
//
//Create a class Counter with a static variable count. Every time an object of Counter is created, increment the count by 1. Add a static method to get the current count.
//
//        Steps:
//        Define a class Counter.
//        Declare a static variable count.
//        Create a constructor that increments count.
//        Add a static method getCount to return the current value of count.
//        Create multiple objects of the Counter class in the main method and display the count using the getCount method.

public class counter {


   static int count;


   public counter(){
       count++;

   }

  static public int getCount(){

       return count;
   }


    public static void main(String[] args) {
       new counter();
        new counter();
        new counter();
        new counter();

        System.out.println(counter.getCount());

    }


}
