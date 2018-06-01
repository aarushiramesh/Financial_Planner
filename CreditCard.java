import java.util.Scanner;
//takes and reports your current credit card balance
public class CreditCard
{
    public int balance;
    public int spent;
    public int salary;
    public int tax;
    
    public CreditCard(int salary)
    {
        System.out.println("What is the federal tax rate?");
        java.util.Scanner scan7 = new java.util.Scanner(System.in);
        int d = scan7.nextInt();
        tax = d;
        salary = salary - (salary * tax);
        balance = balance + salary - spent;
        System.out.println("Your credit card balance is" + "  " + balance);
    }
}
