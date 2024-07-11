package staticKeyword;

public class staticBlock {

   final static  int x;

   static {
       System.out.println("first static block");
       System.out.println(x=10);
   }

    public static void main(String[] args) {
        System.out.println("java is awsome");
        System.out.println(x);
    }

    static {
        System.out.println("second statci block");
        System.out.println(x);
    }
}
