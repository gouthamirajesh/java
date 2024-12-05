package constructors;

public class practise {

    int r=30;
    int k=2;

    public void meth1(int a, int b, int c){



        System.out.println(a+b+c);

         practise aobj2=new practise();
         aobj2.meth2(20,30);


    }

    public  void meth2(int d,int e){

        System.out.println(d-e);

    }

    practise(){

        int v=100;
        int l=2;
        System.out.println(r/k);

    }

    practise(int x){

        int q=20;

        System.out.println(x*q);

    }


    public static void main(String[] args) {

         practise aobj1=new practise(20);
         aobj1.meth1(20,30,40);

    }
}
