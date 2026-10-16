public class ScholarStudent extends Student {
    private double tuitionFee;
    private double scholarshipPercent;

    public ScholarStudent(String name, int studentID, String course, double tuitionFee, double scholarshipPercent) {
        super(name, studentID, course);
        this.tuitionFee = tuitionFee;
        this.scholarshipPercent = scholarshipPercent;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    public double getScholarshipPercent() {
        return scholarshipPercent;
    }

    public void setScholarshipPercent(double scholarshipPercent) {
        this.scholarshipPercent = scholarshipPercent;
    }

    public double calculateDiscount() {
        return tuitionFee * (scholarshipPercent / 100);
    }
    public double calculateFee() {
        return tuitionFee - calculateDiscount();
    }
}
