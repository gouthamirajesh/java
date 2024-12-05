//WAP to calucate the factorial of a number using do while loop

package iterationstatements;

public class claucat {

    public void meth1(){

        int a=5;
        int b=1;
        int z=a*b;

        do {

            --a;
            z=z*a;

        }

        while (a>1);

        System.out.println(z);



    }


    public static void main(String[] args) {

        new claucat().meth1();

    }
}
