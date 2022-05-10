import java.util.Arrays;
import java.util.HashSet;

public class commonElementsArrays
{
    public static void main(String[] args)
    {
        //setting up string arrays
        String [] a ={"game","Train","care","gamble"};
        String [] b ={"game","titan","gamble","care"};

        //print Array string a
        System.out.println("Array String a "+ Arrays.toString(a));

        //print Array String b
        System.out.println("Array string b "+ Arrays.toString(b));


        //find common element calling by object
        HashSet<String> count = new HashSet<String>();

        //creation of nested forloops for calling and comparing arrays:
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i].equals(b[j]))
                {
                    count.add(a[i]);
                }
            }
        }

        //finally sout with oject created
        System.out.println("Common Elements : " + (count));
    }

}
