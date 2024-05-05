import java.util.*;

class StudentDatabase {
    int roll, prn;
    String name;
    Scanner sc = new Scanner(System.in);

    void accept() {
        try(Scanner sc = new Scanner(System.in))
        {
        System.out.println("Enter name: ");
        name = sc.nextLine();

        System.out.println("Enter roll no: ");
        roll = sc.nextInt();

        System.out.println("Enter PRN number: ");
        prn = sc.nextInt();
        }
        catch(Exception ex)
        {
            System.out.print(ex);
        }
    }

    void display() {
        System.out.println("\nName: " + name);
        System.out.println("Roll no: " + roll);
        System.out.println("PRN: " + prn);

    }

    static class StudentInfo {

    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) 
        {
            int i, n;
            StudentDatabase s[] = new StudentDatabase[10];

            // Scanner sc = new Scanner(System.in);

            System.out.println("Enter no of Student data to be entered: ");
            n = sc.nextInt();
            for (i = 0; i < n; i++) {
                s[i] = new StudentDatabase();
                s[i].accept();
            }
            for (i = 0; i < n; i++) {
                s[i].display();
            }

        }
        catch (Exception ex) 
        {
            // sc.close();
            System.out.print(ex);
        }

    }

}
