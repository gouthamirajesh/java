package staticKeyword;

public class stati {

   static int x=stati.meth1();   //100

    public static void main(String[] args) {
        System.out.println(stati.x);
    }

    static
    {
        System.out.println(x);  //100
        stati.x=x+20;        //120
    }

   static public int meth1(){
        stati.x=50;

        return meth2();  //100

    }


  static   int meth2(){
      System.out.println(stati.x);    //x=50
      return 100;
    }

}
