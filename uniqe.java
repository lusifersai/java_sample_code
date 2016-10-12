import java.io.*;

class UniqueNumber
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any number : ");
        int n = Integer.parseInt(br.readLine());
        String s = Integer.toString(n); 
        int l = s.length();
        int flag = 0; 
        for (int i = 0; i < l - 1; i++)
        {
            for (int j = i + 1; j < l; j++)
            {
                if (s.charAt(i) == s.charAt(j))  
                {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0)
            System.out.println(s + " is a Unique Number");
        else
            System.out.println(s + " is Not a Unique Number");
    }
}