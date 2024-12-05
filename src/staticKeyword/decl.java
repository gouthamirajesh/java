package staticKeyword;

public class decl {

    static int a=0;
    int b=0;


    decl(){
        a++;
        b++;
        System.out.println("static variable "+ a );
        System.out.println("instramce veriable "+b);
    }

    public void meth1(){
        System.out.println("access static variable");
        System.out.println(decl.a);
        System.out.println(a);
        System.out.println(new decl().a);
    }

    public static void main(String[] args) {
        new decl();
        new decl();
        new decl();
        new decl().meth1();

    }
}
