package oops;

public class person
{

    private String name;

    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {


        return age;
    }

    public void setAge(int age) {

        if(age>0)
        {

            this.age = age;

        }

        else

            System.out.println("invalid age");


    }

    public static void main(String[] args)
    {
         person practise =new person();
         practise.setAge(10);
         practise.setName("rajesh");
        System.out.println(practise.getName());
        System.out.println(practise.getAge());





    }


}
