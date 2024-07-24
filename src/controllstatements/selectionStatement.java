//Create a Java program that takes a percentage score from the user and prints the corresponding grade based on the following criteria:
//
//        90-100: A
//        80-89: B
//        70-79: C
//        60-69: D
//        Below 60: F
//


package controllstatements;

public class selectionStatement {


    public void meth(int a){

        if (a<60){
            System.out.println("F");
        }

            if(a>=60 && a<=69){

                System.out.println("you got grade D");
            }

            if (a>=70 && a<=79){

                System.out.println("you got c grade");

            }

            if(a>=80 &&a<=89){

                System.out.println("you got B grade");

            }

           if(a>=90){
               System.out.println("A grade");

            }



        }



    public static void main(String[] args) {
        new selectionStatement().meth(90);



    }
}

