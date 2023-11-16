//Q1: Calculate three years of simple interest for a principal amount of 1000 at a 15% interest rate.
public class Q1SimpleInterest {
    public static void main(String[] args)
    {
        double principal=1000, rate=15, interest;
        int years=3;

        interest = (principal * rate * years) / 100;

        System.out.println("Interest: " + interest);
    }
}

/*
What did you learn?
1. Structure of a Java Program
2. Data types and variables: double and int
3. How to write mathematical expressions
4. mathematical operators: * and /
5. How to write output to console
6. How to write comments
*/
