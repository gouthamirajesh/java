// WAP using switch stament that takes 3 inputs from the method as paramters
//operaters(+,-,*,/) and two numbers
// it performs calucation based on the numbers and the operateros entered
//then the result is dispayed on the screen


package controllstatements;

public class swithpractise {


    public void meth1(int a,int b,char f){

        switch (f){

            case '-':
                System.out.println(a-b);
        }

    }


    public static void main(String[] args) {

        new swithpractise().meth1(20,20,'-');

    }
}
