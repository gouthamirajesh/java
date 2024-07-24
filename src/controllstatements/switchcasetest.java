


package controllstatements;

public class switchcasetest {


    public void meth1(){

        int a=20;
        int b=10;

        switch (20) {

            case 10:
                System.out.println("value");
                break;

            case 20:
                System.out.println("switch case1 will be printed");


            if (a > b) {
                System.out.println("A will be printed ");

                break;

            }


        }

        switch (10){

            case 10:
                System.out.println("case 2 will be printed ");

                if (a>b){

                    System.out.println("if case will be executed ");

                }

                else {

                    System.out.println("else case will be executed ");
                }

                break;


        }


        switch (20){

            case 20:
                System.out.println("case 3 will be executed ");

                if(a==b){

                    System.out.println("if condtion will be exyect");


                }

               else if(a>b){

                    System.out.println("else if was executed ");
                    switchcasetest raj=new switchcasetest();
                    raj.meth2();




            }

        }






    }

    public void meth2(){

    }







    public static void main(String[] args) {




    }
}
