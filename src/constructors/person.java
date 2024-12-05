package constructors;

//Create a Person Class
//Attributes: name (String), age (int), and address (String).
//Constructor: Initialize all attributes.
//Methods:
//getDetails(): Return a string with the person's details.


public class person {

    String name;
    int age;
    String address;


    public  person(String s,int a, String b){

        name=s;
        age=a;
        address=b;

    }

    public String getDetails(){

        return name;
    }

    public static void main(String[] args) {

         person aobj1=new person("rajesh",100,"1541 bristol lane ");
        System.out.println(aobj1.name+" "+ aobj1.age+" "+aobj1.address);

    }
}



