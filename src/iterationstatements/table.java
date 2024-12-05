//WAP with parametrized methdo having a postive number as a parameter
//it should then print the mutiplication table of that number
//2*1=2
//2*2=4




package iterationstatements;

public class table {


    public void meth(int a){

        int i;

        for(i=1;i<=20;i++)
        {

            System.out.println(a+ "*"+ i+"="+a*i);


        }



    }

    public static void main(String[] args) {

        new table().meth(10);

    }
}
