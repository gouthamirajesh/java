package staticKeyword;

public class classB {

    int c;
    static int e;

    classB()
    {
        System.out.println(++c);
        System.out.println(++e);
    }

    public static void main(String[] args)
    {
       int a=34;
       int b=21;
       new classB().c= a++ + ++b;
       int d= --a + --b + new classB().c--;
        e= a + +b + +new classB().c + d--;
       int f= -a + b-- + -new classB().c - d++;
       int sume= a+b+ new classB().c + d + e + f;
        System.out.println("sume is : "+sume);
    }
}
