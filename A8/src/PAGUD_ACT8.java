import java.util.ArrayList;
import java.util.Scanner;

public class PAGUD_ACT8 {
    static void main() {

        Scanner sc = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();

        System.out.println("Enter grades (0 or negative to stop):");

        while (true) {
            double grade = sc.nextDouble();

            if (grade <= 0) {
                break;
            }

            grades.add(grade);
        }

        System.out.println("Total grades: " + grades.size());

        for (int i = 0; i < grades.size(); i++) {
            System.out.println("Grade " + (i + 1) + ": " + grades.get(i));
        }

        double highest = grades.get(0);
        double lowest = grades.get(0);
        double sum = 0;

        for (double grade : grades) {
            if (grade > highest) {
                highest = grade;
            }

            if (grade < lowest) {
                lowest = grade;
            }

            sum += grade;
        }

        double average = sum / grades.size();

        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
        System.out.printf("Average grade: %.2f%n", average);
    }
}