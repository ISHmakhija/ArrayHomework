import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Equality2Arrays
{


    public static void main(String[] args)
    {
        //intializing int arrays
        int[] a= {2,4,6};
        int[] b= {2,6,8};

        //comparing two arrays
        boolean compare= Arrays.equals(a,b);
        System.out.println("Equality Int 2 Arrays are : "+ compare);
    }
}
