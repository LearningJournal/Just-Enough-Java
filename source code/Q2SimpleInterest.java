import java.util.Scanner;

//Q2: Write a program to accept principal, interest rate, and years from the user and calculate simple interest.
public class Q2SimpleInterest {
    public static void main(String[] args)
    {
        double principal, rate, interest;
        int years;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Principal Amount:");
        principal = sc.nextDouble();

        System.out.println("Enter the Interest Rate:");
        rate = sc.nextDouble();

        System.out.println("Enter the Years:");
        years = sc.nextInt();

        interest = principal * rate * years / 100;

        System.out.println("Interest: " + interest);

    }
}
