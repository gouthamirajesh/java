package staticKeyword;

public class classA {

    int x=12;
    static int y=45;

    void meth1(){
        System.out.println("intsnace method m1");
    }

    void meth2(){
        System.out.println(x);
        new classA(500).meth1();
        System.out.println(y);
        meth3();
        System.out.println("instance method meth2()");
    }
    static void meth3()
    {
        System.out.println("static method meth3()");
    }
    classA(int a)
    {
        y=a;
    }
    classA()
    {
        y=50-38;
    }

    public static void main(String[] args) {
        System.out.println(y);
        meth3();
        classA a= new classA();
        System.out.println(a.x);
        a.meth2();
    }



}
