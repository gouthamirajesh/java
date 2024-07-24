//WAP take a parametrirzed constructor with two int values & print gratest among them

package controllstatements;

public class practise {


    practise(int a,int b){

        if (a>b){
            System.out.println("if condition " +a);
        }

        else
            System.out.println("gratest value is executed "+b);

    }


    public static void main(String[] args) {

        new practise(10,20);

    }
}
