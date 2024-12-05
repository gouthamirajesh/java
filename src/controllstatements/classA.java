package controllstatements;

public class classA {


    public void meth1(int a){
        System.out.println("meth1 is claLLED ");
        System.out.println("mutiple stamenst");

       if (a>=10){
           System.out.println("if block executed");
           System.out.println("mutiple stamenst");

       }

    }

    private void meth2(int b){
        if (b<10){
            System.out.println("meth 2 is called ");
            System.out.println("meth 3 is called ");


        }

    }

    public void meth3(int a,int b){

        if (a>b){
            System.out.println("meth 3 is called ");
            System.out.println("mutiple stamenst");



        }

        else {

            System.out.println("else block executed ");
            System.out.println("mutiple statements ");

        }
    }

    private void meth4(int a){

        if (a>=10)
            System.out.println("mutiple statemnsts");
            else
        System.out.println("mutiple");
        System.out.println("class is executed");
        System.out.println("yth");
    }

    public void meth5(int a){

        if (a>10){
            System.out.println("sysyement 1");
            System.out.println("statment 2");


        }

        else{
            System.out.println("stament 1");
            System.out.println("statejy6");
        }
        System.out.println("outside else block");
    }

    private void meth6(){

        if (true){

            System.out.println("true else ");


        }

        else {
            System.out.println("else block executed ");
        }
    }

    public int meth7(){

        return 10;
    }

    protected void meth8(){
        int x=new classA().meth7();
        if (x<10){
            System.out.println("sharp student rajesh");

        }

        else {
            System.out.println("else block executed");
        }
    }

    public void meth9(){

        if (5>10){

            System.out.println("if condition is executed ");
        }

        else if (12>10){
            System.out.println("else condition is execited ");
        }

        else  {

            System.out.println("else if executed ");
        }
    }

    public static void main(String[] args) {

        new classA().meth1(10);
        new classA().meth2(20);
        new  classA().meth3(5,10);
        new classA().meth4(10);
        new classA().meth5(10);
        new classA().meth6();
        new classA().meth7();
        new classA().meth8();
        new classA().meth9();

    }
}
