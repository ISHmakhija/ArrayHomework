import java.util.Arrays;

public class removeElement
{
    public static void main(String[] args)
    {
        //declare arrays in INTEGER
      int[] a={10,20,30,40,50,60,70,80,90};

      //Sout to check their presence
        System.out.println("Original arrays : " + Arrays.toString(a));

        //Index from which element to be deleted
        int index =3;

        //display index
        System.out.println("Elements to be removed at Index : "+ index);

        //if array index is zero or novalue
        if(a==null || index== 0 || index== a.length)
        {
            System.out.println("No removal operation can be performed.");
        }

        //create an array to hold elements after deletion
        int[] duplicate_a = new int[a.length-1];

        //copy elements from original array from start till index into duplicate_a
        System.arraycopy(a,0,duplicate_a,0,index);

        //copy elemnts from original array from index+1 till end
        System.arraycopy(a,index+1,duplicate_a,index,a.length-index-1);

        //display the copied array after deletion
        System.out.println("Arrays After deleting an element : "+ Arrays.toString(duplicate_a));
    }





}
