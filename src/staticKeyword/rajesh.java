package staticKeyword;

public class rajesh {

   static int x;
   int y;


   rajesh(){
       System.out.println("instance variable "+ ++y);
       System.out.println("static variable "+ ++x);
   }

    public static void main(String[] args) {
        rajesh aobj1=new rajesh();
        rajesh aobj2=new rajesh();
        rajesh aobj3=new rajesh();

    }
}
