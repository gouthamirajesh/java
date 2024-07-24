package wrapperclass;

public class autounboxing {


    autounboxing(){

        Integer k=new Integer(50);
        int r=k;
        int w=k.intValue();

        System.out.println(k);
        System.out.println(r);
        System.out.println(w);
    }

    static void meth1(){

        Boolean b=new Boolean(true);
        boolean r=b;
        boolean k=b.booleanValue();

        System.out.println(b);
        System.out.println(r);
        System.out.println(k);
    }

    public void meth3(){

        Integer i=new Integer(50);
        Integer k=new Integer("500");
        //Integer p= new Integer("rajesh");
        Character c=new Character('c');
        Boolean b=new Boolean("20");


        System.out.println(i);
        System.out.println(b);
        //System.out.println(p);
    }





    public static void main(String[] args) {

//        new autounboxing();
//
//        meth1();
//        new autounboxing().meth1();
//        autounboxing.meth1();

        new autounboxing().meth3();




    }
}
