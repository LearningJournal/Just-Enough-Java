import java.util.Scanner;

/*
    Q3: Write a program to input the following from a user.
        1. Number of items sold
        2. Total selling price
        3. Total profit
    Calculate and print the cost per unit.
*/

public class Q3ProfitPerUnit {
    public static void main(String[] args)
    {
        int items;
        double total_price, total_profit, cost_per_unit;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of items sold:");
        items = sc.nextInt();

        System.out.println("Enter the total selling price:");
        total_price = sc.nextDouble();

        System.out.println("Enter the total profit:");
        total_profit = sc.nextDouble();

        cost_per_unit = (total_price / items) - (total_profit / items);

        System.out.println("Cost per unit is: " + cost_per_unit);

    }
}
