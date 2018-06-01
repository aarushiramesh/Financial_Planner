//advises and tells the user whether their financial situation is good for the future
//advises them
public class Advise
{
    // instance variables - replace the example below with your own
    public int salary;
    public int spent;
    public int covered;
    public int balance;
    public int tax;
    public Advise()
    {
    System.out.println("Are you spending the right way? Are your spending habits good for the future?");
    System.out.println("Lets find out.");
  
    salary = 0;
    System.out.println("Enter your Salary for every year in thousands.");
    java.util.Scanner scan = new java.util.Scanner(System.in);
    int i = scan.nextInt();
    salary = i;
    System.out.println("Your salary is" + " " + salary);
    getSalary salary1 = new getSalary(salary);
    spent = 0;
    System.out.println("Enter how much you spend on groceries every month.");
    java.util.Scanner scan3 = new java.util.Scanner(System.in);
    int a = scan3.nextInt();
    spent = 12*a + 0;
    getSpent spent1 = new getSpent(spent, covered);
    CreditCard balance1 = new CreditCard(salary);
    int balance = balance1.balance;
        if (spent >= 0.5*salary) {
            System.out.println("You are spending too much. Start to save more money for retirement, savings and emergencies.");
}       else {
            System.out.println("You are in a good position. You can use the money remaining for savings.");
}    
    System.out.println("20% of your earnings should go towards saving for the future.");
    System.out.println( 0.2*salary + " " + "should go towards savings.");
    System.out.println("Are you retiring?");
    java.util.Scanner scan9 = new java.util.Scanner(System.in);
    String f = scan9.nextLine();
        if (f == "Yes") {
            System.out.println("You should save about 15-20% of your earnings starting now.");
}       else {
            System.out.println("You are in a good position. You can use the money remaining for savings.");
}    
}
}
