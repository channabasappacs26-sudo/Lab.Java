import java.util.Scanner;

class Student
{
    String USN;
    String name;

    void accept()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter USN: ");
        USN = sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();
    }

    void display()
    {
        System.out.println("USN is: " + USN);
        System.out.println("Name is: " + name);
    }
}

class StudentRun
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        for (int i = 0; i < n; i++)
        {
            s[i] = new Student();
            s[i].accept();
        }

        System.out.println("\nStudent Details:");

        for (int i = 0; i < n; i++)
        {
            s[i].display();
        }
    }
}
