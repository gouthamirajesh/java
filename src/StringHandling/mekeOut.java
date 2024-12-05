// Given an "out" String of length 4 i.e "<<>>"& a word String
// return a new string where the word is in the middle of outstring  eg: <<word>>
// makeoutword("<<>>","java")  o/p <<java>>
//("[[]]", "java") o/p [[java]]

// public String makeoutword(String out,String word)

package StringHandling;

public class mekeOut
{

    public String makeOutWord(String out,String Word)
    {
        String start=out.substring(0,2);

        String end =out.substring(2);

        return start+ Word + end;



    }

    public static void main(String[] args)
    {



        String k=new mekeOut().makeOutWord("[[]] ","java");

        System.out.println(k);




    }


}
