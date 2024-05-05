import java.util.Scanner;

public class exceptionhandling 
{
    public static void main(String[] args) 
    {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        try 
        {
            c = a/b;
            System.out.println(c);
        } 
        catch (Exception e) 
        {
            System.out.println(e);    
        }
    }
}
