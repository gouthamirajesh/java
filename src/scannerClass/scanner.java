

package scannerClass;

import java.util.Scanner;

public class scanner {

    Scanner r=new Scanner(System.in);

    public void meth(){



        System.out.println("eneter a value ");
        int a= r.nextInt();

        System.out.println("enter b value");
        int b =r.nextInt();

        System.out.println(a+b);




    }

    public void meth1(){

        System.out.println("enter name");
        String s= r.nextLine();

        System.out.println("enter age");
        int a=r.nextInt();

        if(a>18)
        {
            System.out.println("you are eligible for vote ");

        }

        else {

            System.out.println("you are not elible beacuse you are "+ (18-a)+ " years younger");
        }


    }


    public static void main(String[] args)
    {
       // new scanner().meth();
        new scanner().meth1();


    }
}
