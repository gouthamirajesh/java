// WAP that counts down from 10 to 1 using loop

package iterationstatements;

public class test1 {


    public void meth(int a){

        int b=0;

        while (a>=1)
        {
            b=b+a;
            a--;

        }
        System.out.println(b);
        }


    public static void main(String[] args) {
        new test1().meth(10);

    }

}
