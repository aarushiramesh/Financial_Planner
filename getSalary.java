import java.util.Scanner;
//gets salary from user
public class getSalary
{
    public int salary;
    public getSalary(int salary)
    {    
    System.out.println("Are you living alone?");
    java.util.Scanner scan1 = new java.util.Scanner(System.in);
    String y = scan1.nextLine();
        
        if (y == "Yes") {
        System.out.println("Enter your Salary for your partner or other working member");
        java.util.Scanner scan2 = new java.util.Scanner(System.in);
        int x = scan2.nextInt();
        salary = x + salary;
        System.out.println("Thank you. Your information is being processed.");
    }   else {
        System.out.println("Thank you. Your information is being processed.");
    }
}
}
