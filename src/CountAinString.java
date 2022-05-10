import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class CountAinString
{
    public static void main(String[] args)
    {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A Sentence : ");
        String A = scanner.nextLine();

        for (int i = 0; i <A.length(); i++)
        {
            char b = A.charAt(i);
            if (b=='a' || b=='A') {count ++;}
        }
        System.out.println("Number of A in the given Sentence is/are "+ count);
    }
}
