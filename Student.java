import java.util.Scanner;

class Student
{
    int roll, prn;
    String name;
Scanner sc = new Scanner(System.in);
    void accept()
    {
        System.out.println("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your roll no: ");
        roll = sc.nextInt();
        
        System.out.print("Enter your PRN number: ");
        prn = sc.nextInt();
        
    }
    void display()
    {
        System.out.println("\nYour Name: " + name);
        System.out.println("Your Roll no: " + roll);
        System.out.println("Your PRN: " + prn);
       
    }
    public static void main(String args[])
    {
        Student s = new Student();
        s.accept();
        s.display();
    }
}