package controllstatements;

public class Switch {

   void meth1(){


       switch (30){

           case 10:
               System.out.println("1st case executed");
               //break;

           case 20:
               System.out.println("2nd case executed ");
              // break;


               case 30:
                   System.out.println("3rd case executed");
                  // break;

           case 40:
               System.out.println("4th case executed");
              // break;

           case 50:
               System.out.println("5th case executed ");
              // break;

       }
    }


    public static void main(String[] args) {

       new Switch().meth1();

    }
}
