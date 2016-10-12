
import java.util.*;

class SunnyNumber
{
    public static void main(String[] args)
    {
        int n, n1;
        double x;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        n = sc.nextInt();

        n1 = n + 1;
        x = Math.sqrt(n1);

        if ((int) x == x)
        {
            System.out.println("Number is a Sunny Number");
        }

        else
        {
            System.out.println("Number is not a Sunny Number");
        }
    }
}