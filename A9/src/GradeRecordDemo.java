import java.util.ArrayList;
import java.util.Scanner;

public class GradeRecordDemo {

    static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<GradeRecord> records = new ArrayList<>();

        while (true) {
            System.out.print("Enter subject name (or 'done' to finish): ");
            String subject = scan.nextLine();

            if (subject.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Enter Quiz 1: ");
            double q1 = scan.nextDouble();

            System.out.print("Enter Quiz 2: ");
            double q2 = scan.nextDouble();

            System.out.print("Enter Quiz 3: ");
            double q3 = scan.nextDouble();
            scan.nextLine();

            if (q1 < 0 || q1 > 100 || q2 < 0 || q2 > 100 || q3 < 0 || q3 > 100) {
                System.out.println("Invalid score! All scores must be between 0 and 100. Record not saved.");
            } else {
                GradeRecord record = new GradeRecord(subject, q1, q2, q3);
                records.add(record);
            }
        }
        System.out.println();

        if (records.isEmpty()) {
            System.out.println("No grade records to display.");
        } else {
            double total = 0;

            for (GradeRecord record : records) {
                record.displayReport();
                total += record.getAverage();
            }
            double overallAverage = total / records.size();

            System.out.printf("Overall Average Across All Subjects: %.2f%n", overallAverage);
            System.out.println("Total Subjects Recorded: " + records.size());
        }
    }
}