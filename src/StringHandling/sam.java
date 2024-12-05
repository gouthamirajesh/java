//Given a string return a new string made of 3 copies of the last two char of original string
//extraend ("hello") //op lololo

package StringHandling;

public class sam
{

    public static String extraend(String str)

    {

//        if(str.length()>2){
//
//            return str;
//        }


         String lastTwo=str.substring(str.length()-2);

        return lastTwo + lastTwo + lastTwo;





    }


    public static void main(String[] args)
    {

        String s="hello";

        String result=extraend(s);

        System.out.println(result);

    }
}
