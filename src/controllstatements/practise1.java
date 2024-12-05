//A shop will give disscount of 10% if the cost of the purchase qunatity is equals to (or) more than 1000
//take a parametrized method which give the quantity (units)
//suppose one unit will cost 100. judge & print total cost of the user




package controllstatements;

public class practise1 {


    public void meth1(int quantity){
        int units=100;
        int total =quantity*units;


       if (total>=1000){

           int discount=(total/100)*10;

           System.out.println("applicable disccount "+ discount);
           System.out.println("total cost with discount" + (total-discount));
       }

       else
           System.out.println("you are not eligible for discount ");




        }


    public static void main(String[] args) {

        new practise1().meth1(1);

    }
}
