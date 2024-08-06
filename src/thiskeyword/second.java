package thiskeyword;

public class second
{

    public int meth1(int a, int b)
    {


        return (a+b)+(a-b);

    }

    public int meth2()
    {
        System.out.println("meth2 is called ");
        return 1;
    }


    second()
    {
        this("java is awsowme");

        System.out.println("default constructer callled");

    }

    public int meth3()
    {
        System.out.println("meth3 is called ");

        return 1;

    }

    public String meth4(int a,String s)
    {

        System.out.println("meth4 is called ");

        a=a+4;

        System.out.println(a);
        System.out.println(s);

        return s+"object oriented progarm";
    }

    public  int meth5 (int a ){

        System.out.println("meth 5 called");

        return 10-a;
    }

    second(String s)
    {
     String result=this.meth4(this.meth1(this.meth2(),this.meth5(5)+'A'-('a')),"java");

        System.out.println(result);

        System.out.println(s);

    }



    public static void main(String[] args)

    {
        new second();

    }
}
