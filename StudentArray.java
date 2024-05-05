import java.util.*;
class StudentArray
{
static class StudentInfo
{
    int roll, prn;
    String name;
    Scanner sc = new Scanner(System.in);
    
    void accept()
    {
        

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter roll no: ");
        roll = sc.nextInt();
        
        System.out.print("Enter PRN number: ");
        prn = sc.nextInt();
        
    }
    void display()
    {
        System.out.println("\nName: " + name);
        System.out.println("Roll no: " + roll);
        System.out.println("PRN: " + prn);
       
    }
}
    
        public static void main(String args[])
        {
            int i, n;
            StudentInfo s[] = new StudentInfo[10];
            
            
            Scanner sv = new Scanner(System.in);
            System.out.println("Enter no of Student data to be entered: ");
            n = sv.nextInt();
            sv.close();
            for (i = 0 ; i < n ; i++)
            {
                Scanner sc = new Scanner(System.in);
                s[i] = new StudentInfo();
                s[i].accept();
                sc.close();
            }
            for (i = 0 ; i < n ; i++)
            {   
                s[i].display();
            }
        }
        
}

