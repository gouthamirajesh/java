package constructors;

public class constructor {

    int x;
    String S;
    static String name ="raj";



    public constructor(int a,String s){

        x=a;
        S=s;



    }

    public static void main(String[] args) {

        constructor aobj1=new constructor(10,"sodhi");
         constructor aobj2=new constructor(100,"rajesh");
          constructor aobj3=new constructor(200,"gotham");
        System.out.println(aobj1.x  + " " +aobj1.S+ " " +name);
        System.out.println(aobj2.x+" "+aobj1.S+ " "+name );

    }
}
