package Exc1;

import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = startNumber; i <= endNumber ; i++) {
            sum += i;
            System.out.printf("%d ", i);
        }
        System.out.printf("%nSum: %d", sum);
    }
}
