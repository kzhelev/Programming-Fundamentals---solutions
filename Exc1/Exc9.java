package Exc1;

import java.util.Scanner;

public class Exc9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double price = 0.0;
        double totalPrice = 0.0;

        for (int i = 1; i <= n; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());
            price = pricePerCapsule * (capsulesCount * days);
            totalPrice += price;
            System.out.printf("The price for the coffee is: $%.2f%n", price);
        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
