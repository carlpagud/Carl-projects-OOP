import java.util.Scanner;

public class PAGUD_PROBLEM12 {

    static boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        int num, highest = 0, lowest = 0;

        System.out.println("[Enter 5 positive numbers.]");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            num = sc.nextInt();

            if (isPrime(num)) {
                if (lowest == 0)
                    lowest = num;

                if (num > highest)
                    highest = num;
            }
        }

        if (highest == 0)
            System.out.println("No prime numbers entered.");
        else {
            System.out.println("Highest prime: " + highest);
            System.out.println("Lowest prime: " + lowest);
        }
    }
}