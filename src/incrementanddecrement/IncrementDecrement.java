package incrementanddecrement;

//Task 1: Simple Increment and Decrement
//        Create a class IncrementDecrement with methods to demonstrate the use of both pre-increment and post-increment, as well as pre-decrement and post-decrement operators. Print the values before and after using these operators.
//
//        Steps:
//        Define a class IncrementDecrement.
//        Create methods to demonstrate pre-increment, post-increment, pre-decrement, and post-decrement.
//        Print the values of variables before and after applying the operators in each method.
//        Call these methods in the main method.

public class IncrementDecrement {
       int x=10;
       int y=20;

    public void preincrement(){

        System.out.println("before preincremnet"+ " "+ x);
        System.out.println("after preincremnet "+ " "+ ++x);

    }

    public void postincrement(){

        System.out.println("before postincrment"+ " "+ x);
        x++;
        System.out.println(x);

    }

    public void predecrement(){

        System.out.println("before predecremenrt");

        System.out.println(--x);

    }

    public void postdecremnet(){

        System.out.println("before postdecrement");
        x--;
        System.out.println(x);

    }

    public static void main(String[] args) {

       IncrementDecrement aobj=new IncrementDecrement();
                    new IncrementDecrement().preincrement();
                    new IncrementDecrement().postincrement();
                    new IncrementDecrement().predecrement();
                    new IncrementDecrement().postdecremnet();


    }


}
