package com.company;

import static java.lang.System.in;

public class interfaceR {

   interfaceR(){
       System.out.println("non perameterized constructer called ");
       new interfaceR("rajesh").meth2();
   }

   interfaceR(String s){

       System.out.println("perameterized constructer called"+s);
       new interfaceR(10,20);

   }

   public interfaceR(int a,int b){
       System.out.println((a+b));
   }

   public void meth1(){
       System.out.println("java is awsome");
   }

   public  void meth2(){
       System.out.println("meth2 is called");

   }


    public static void main(String[] args) {
        interfaceR aobj1=new interfaceR();
           aobj1.meth1();
    }

}
