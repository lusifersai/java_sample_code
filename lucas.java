
import java.util.*;

class LucasSeries
{
    public static void main(String[] args)
    {
        int num1, num2, limit, add;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the limit of elements");
        limit = sc.nextInt();

        num1 = 2;
        num2 = 1;

        System.out.println("\nLucas Series:");
        while (limit >= num1)
        {
            System.out.print(num1 + " ");
            add = num1 + num2;
            num1 = num2;
            num2 = add;
        }
    }
}