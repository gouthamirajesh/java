package oops;

public class cj extends cv
{

    void meth2(){

        System.out.println("meth 2 called ");
    }

    cj(){
          //super();
        this(100);
        System.out.println("2nd default constructer cakked ");

    }

    cj(int i){

        System.out.println("2nd paramterized constructer called ");
    }

    public static void main(String[] args) {
         cj aobj =new cj();
         aobj.meth2();

    }
}
