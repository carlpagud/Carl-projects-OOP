import java.util.ArrayList;
import java.util.Scanner;

public class PAGUD_PROBLEM18 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> color = new ArrayList<String>();

        for (byte i = 1; i <= 3; i++) {
            System.out.print("Enter your " + i + " color: ");
            color.add(sc.nextLine());
        }

        System.out.println("\nYour favorite colors: ");
        for (String s : color) {
            System.out.println(s);
        }
    }
}
