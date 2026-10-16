import java.util.Scanner;

public class PAGUD_PROBLEM16 {

    public static int reverse(int num) {
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.println("Reversed number: " + reverse(num));
    }
}
