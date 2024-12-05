package staticKeyword;

public class duggu {

    public void meth1(int a){
        if (!(a<=10 && a<=20 ))
        {
            System.out.println("if block executed ");
        }
        else
        {
            System.out.println("else block executed");
        }
    }


    public void meth2(int b){

        if (!(b>=40 || b>=50)) {
            System.out.println("if block executed ");
        }
        else
        {
            System.out.println("else block executed");
        }
    }


    public void meth3(int c){

        if (c>21)
        {
            System.out.println("person eleijible for vote and voted ");
        }

        else
        {
            System.out.println("not elible for vote ");
        }
    }

    public static void main(String[] args) {

     // new duggu().meth1(5);
        new  duggu().meth2(43);
       // new duggu().meth3(18);

    }
}
