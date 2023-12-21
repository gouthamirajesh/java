package com.company;

public class test {

    public static void main(String[] args) {
        test rajesh=new test();//2 scp,heap area
         test gouthami=new test();
         test walmart=new test();

        System.out.println("rajesh object"+rajesh);     //rajeshobject+hexa2233
        //converts object into string format
        System.out.println("gouthami"+ gouthami.getClass());// gouthami package.com.company.test
        // it will get the class information incuding package details of that respective object present inside the class
        System.out.println("rajesh"+rajesh.toString());  //rajesh heaxa
        //converts object into string fromat
        System.out.println("walmart"+walmart.hashCode());   //walmart 1223345
        //it will gerate unique identification number for our objects
        System.out.println("equls method"+rajesh.equals(gouthami)); //equlas method false
        //it will compares the address location of two objects

    }
}