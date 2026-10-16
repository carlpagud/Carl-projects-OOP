import java.util.Arrays;

public class GradeRecord {

    private String subject;
    private double[] scores;
    private double average;

    public GradeRecord(String subject, double q1, double q2, double q3) {
        if (q1 < 0 || q1 > 100 || q2 < 0 || q2 > 100 || q3 < 0 || q3 > 100) {
            System.out.println("Invalid score!");
            scores = new double[]{0, 0, 0};
            average = 0;
        } else {
            this.subject = subject;
            scores = new double[]{q1, q2, q3};
            average = (q1 + q2 + q3) / 3.0;
        }
    }

    public String getSubject() {
        return subject;
    }

    public double[] getScores() {
        return Arrays.copyOf(scores, scores.length);
    }

    public double getAverage() {
        return average;
    }

    public void displayReport() {
        System.out.printf("%s | Quizzes: %s | Average: %.2f%n", subject, Arrays.toString(scores), average);
    }
}