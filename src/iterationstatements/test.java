package iterationstatements;

public class test {


    public void meth1(int a ){

        System.out.println("meth is called");

        while (a<=5){

            System.out.println("a value" + a++ );
            a++;
            System.out.println("meth is executed" + ++a);

        }




    }

    public void meth2(int b){

        while (true){

            System.out.println("i value"+b);
            b++;


        }
    }


    public void meth3(int c){

        do{

            System.out.println("i value" + c);
            c++;

        }
        while (c<=5);
    }

    public static void main(String[] args) {

       // new test().meth1(1);
       // new test().meth2(1);
        new test().meth3(1);

    }
}
