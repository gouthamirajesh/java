package staticKeyword;
//
//Task 2: Static Methods
//        Create a class MathUtils with a static method square that takes an integer and returns its square. Test this method without creating an object of the class.
//
//        Steps:
//        Define a class MathUtils.
//        Create a static method square that takes an integer parameter and returns its square.
//        In the main method, call the square method and print the result without creating an object of MathUtils.

public class mathUtils {


   static public int square(int square){

       return square;
    }


    public static void main(String[] args) {

        System.out.println(mathUtils.square(10));



    }

}
