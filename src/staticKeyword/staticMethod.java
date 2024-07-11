package staticKeyword;

public class staticMethod {

    final int a=10;
    static int b=20;

    public void meth1(){
        System.out.println("meth1 called ");
        System.out.println("instance variable" + new staticMethod().a);
        System.out.println("static variable" + staticMethod.b );
    }

   static public void meth2(){
       System.out.println("meth 2 called ");
       System.out.println("instance variable"+new staticMethod().a);
       System.out.println("static variable "+b);

    }

    public static void main(String[] args) {
        new staticMethod().meth1();
        staticMethod.meth2();

    }

}
