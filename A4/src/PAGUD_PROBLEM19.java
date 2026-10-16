import java.util.ArrayList;
import java.util.Scanner;

public class PAGUD_PROBLEM19 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();

        for (byte i = 0; i < 4; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            num.add(sc.nextInt());
        }

        System.out.println("Current List: " + num);

        System.out.print("Enter index to delete (0-3): ");
        byte indx = sc.nextByte();

        num.remove(indx);

        System.out.println("Updated List: " + num);
        System.out.println("New Size: " + num.size());
    }
}
