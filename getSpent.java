import java.util.Scanner;
//returns the value for how much an individual or family spends
public class getSpent
{
    public int spent;
    public int covered;
    public getSpent(int spent, int covered)
    {
        System.out.println("Enter how much you spend on anything else every month");
        java.util.Scanner scan4 = new java.util.Scanner(System.in);
        int d = scan4.nextInt();
        spent = spent + 12*d;

        System.out.println("How much does your car insurance cover in percentage?");
        java.util.Scanner scan5 = new java.util.Scanner(System.in);
        int c = scan5.nextInt();
        covered = c;

        System.out.println("How much does your health insurance cover in percentage?");
        java.util.Scanner scan8 = new java.util.Scanner(System.in);
        int e = scan8.nextInt();
        covered = covered + e;
        
        System.out.println("Do you have a mortgage?");
        java.util.Scanner scan6 = new java.util.Scanner(System.in);
        String s = scan6.nextLine();
        if (s == "Yes") {
        System.out.println("Enter how much you spend on mortgage.");
        java.util.Scanner scan7 = new java.util.Scanner(System.in);
        int b = scan7.nextInt();
        spent = spent + b;
    }   else {
        System.out.println("Thank you. Your information is being processed");
    }
}
}
