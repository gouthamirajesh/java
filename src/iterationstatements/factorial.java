package iterationstatements;

public class factorial {

    public void meth(int a){
        int i=1;


        for (;a>=1;a--)
        {
            i=a*i;



        }

        System.out.println(i);

    }

    public static void main(String[] args) {

        new factorial().meth(5);

    }
}
