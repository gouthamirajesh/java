package staticKeyword;

public class test {

     static int x=meth1();



   static   public int meth1(){

       return 100;
     }

     static
     {
         System.out.println("first ststic block" + " "+ x);
     }

    public static void main(String[] args) {
        System.out.println("main method called "  + x);
    }

    static
    {
        System.out.println("second static block" + " "+ x);


    }
}
