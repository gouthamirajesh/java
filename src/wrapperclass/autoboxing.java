package wrapperclass;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class autoboxing {


    autoboxing(){

        int i=10;
        Integer i2=i;

        Integer i3=Integer.valueOf(i);
        Integer i4=new Integer(i);

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

    }

    public  void meth1() {
        char c = 'R';
        Character k = c;
        Character p = Character.valueOf(c);
        Character t = new Character(c);

        System.out.println(c);
        System.out.println(k);
        System.out.println(p);
        System.out.println(t);

    }

   static public void meth2(){

       float f=10.5f;
       Float t=f;
       Float k=Float.valueOf(f);
       Float y=new Float(f);

        System.out.println(f);
        System.out.println(t);
        System.out.println(k);
        System.out.println(y);

    }




    public static void main(String[] args) {

        new autoboxing();
        new autoboxing().meth1();
        meth2();
        autoboxing.meth2();
        new autoboxing().meth2();



    }
}
