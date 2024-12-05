package constructors;

 class classZ
{
    int a=10;
    public  String testmethod()
    {
        new classZ(100,200,"java");
        System.out.println(40);
        return new classZ().testmethod3(new classZ(50).testmethod2())+new classZ().testmethod4("Hi");
    }
    classZ()
    {
        System.out.println("Hi");
    }
    public int testmethod2()
    {
        System.out.println(50);
        return 10+15;
    }
    classZ(int a)
    {
        System.out.println("java is awesome");
    }
    public String testmethod3(int a)
    {
        System.out.println(18);
        return "is";
    }
    classZ(int a, int b, String s)
    {
        System.out.println(a+b);
        System.out.println(s);
    }
    public String testmethod4(String s)
    {
        System.out.println(88);
        return "good";
    }

    public static void main(String[] args)
    {
       classZ t1=new classZ();
       t1.a=10;
       classZ t2=new classZ(50);
       t2.a=30;
        System.out.println("java "+t1.testmethod()+" "+(t1.a+t2.a-30));
    }
}


