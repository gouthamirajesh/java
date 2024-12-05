//WAP to take values of length & breadth of a rectangle from parametrized method & check if it is a square or not


package controllstatements;

public class com {


    public void meth1(int length,int breath){

        if (length==breath){

            System.out.println("lenghts are equal it is a square ");

        }

        else
        {
            System.out.println("it is a rectangle ");
        }

    }

    public static void main(String[] args) {

        new com().meth1(10,5 );

    }
}
