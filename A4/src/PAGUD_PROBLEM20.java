import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PAGUD_PROBLEM20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<String> fruits = new HashSet<String>();

        for (byte i = 0; i < 5; i++) {
            System.out.print("Enter fruit " + (i + 1) + ": ");
            fruits.add(sc.nextLine());
        }

        System.out.println("Fruit basket: " + fruits);
    }
}