package constructors;

public class kishan
{

    public kishan(){
        System.out.println("sunday");
        kishan obj=new kishan(10);
        System.out.println("tuesday");
        String s= obj.meth1("challenge accepted");
        System.out.println(s);
    }
    kishan(int a){
        System.out.println("saturday");
        kishan obj=new kishan(10,20);
        int z=obj.meth2()+a;
        System.out.println(">>>>>"+(z+obj.meth3()));
        System.out.println("monday");
    }
    public String meth1(String s){
        System.out.println("in next statment i am retruing the string value ");
        return s;
    }
    int meth2(){

        return 100;
    }

    int meth3(){

        return 99;
    }
    kishan(int r,int y){
        System.out.println("thursday");
        System.out.println("===>"+(r+new kishan("hi").meth3()-y));

    }
    kishan(String s)
    {
        System.out.println(s);
    }

    public static void main(String[] args) {
        kishan obj=new kishan();
        System.out.println("output verified");

    }

    }



