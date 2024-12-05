// WAP to print biggest value amoung 3 numbers  Take a method with 3 parameters

package controllstatements;

public class test {

public void meth1(int a ,int b, int c){

    if (a>b && a>c){

        System.out.println(" biggest value "+a);


    }
 else if  (b>c && b>a){

        System.out.println("biggest value" +b);

    }

  else

        System.out.println("value of c "+c );
}

    public static void main(String[] args) {

    new test().meth1(500,10,150);

    }

}
