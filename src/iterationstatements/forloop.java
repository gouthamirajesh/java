package iterationstatements;

public class forloop {

public void meth(){

    for(int i=10;i>=0;i--){

        System.out.print("looping lapanag"+i);
        //ll 0
        //ll 1
        //ll 2     //10

    }





}

public  void even(){
    int i;

    for (i=0;i<=20;++i){
        System.out.print("even numbers"+ i++ +" "  );


    }


}

public void odd(){

    int i;

    for (i=0;i<=10;){

        System.out.println("odd numbers"+ i++);

    }

}

public void test(){

    System.out.println("test ");

    for (int i=1;i<3;){
        System.out.println("i value "+ ++i);
        System.out.println("test is executed ");

    }
}

public void pen(){
    int i=10;
    for (;i<=11;){

        System.out.println(i++);
        break;


    }
}

    public static void main(String[] args) {

   // new forloop().meth();
   // new forloop().even();
    new forloop().odd();
       // new forloop().test();
       // new forloop().pen();

    }
}
