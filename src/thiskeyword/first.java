package thiskeyword;

public class first
{

    public first meth1(){

        System.out.println("meth1 called");

        return new first() ;
    }


    public first meth2(){

        System.out.println("meth2 called ");

        return this;
    }

    public int meth3(){

        System.out.println("meth 3 called ");

        return 10;
    }

    public String meth4(){

        return "rajesh";
    }

    first(){

        this(10);

        System.out.println("first constructer called ");



    }


    public first(int a)
    {


    }

    public static void main(String[] args)
    {
        String x= new first().meth1().meth2().meth4();
        int a= new first().meth3();

        System.out.println(x);
        System.out.println(a);

    }
}
