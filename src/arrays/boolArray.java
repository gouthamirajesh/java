//given an array of int, return true if 6 appears either the first or last element in the array
//if firsrlast6([12,43,9,22,6]) true
//if firstlast6([3,65,31,89,36]) false
//if firstlast6([6,23,8,11])    true


package arrays;

public class boolArray
{




    public Boolean firstlast6(int r[])
    {

        if(r[0]==6 || r[r.length-1]==6)

        {
            return true;


        }

        else

            return false;

    }


    public static void main(String[] args)
    {
        int r[]={1,2,3,4,5};

        new boolArray().firstlast6(r);

        boolArray object=new boolArray();

        Boolean rajesh=object.firstlast6(r);

        System.out.println(rajesh);







    }
}
