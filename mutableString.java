import java.util.Scanner;

public class mutableString
{
    public static void main(String[] args) 
    {
        String s1, s2, s3;
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        System.out.println(s1);
        System.out.println(s2);
        
        s1.concat(s2);// unable to concatenate the existing
        System.out.println(s1);
        
        s3 = s1.concat(s2);// able to concatenate now
        System.out.println(s3);
        sc.close();
    }
}