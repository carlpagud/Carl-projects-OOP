public class RegularStudent extends Student {
    private double tuitionFee;
    private double miscellaneousFee;

    public RegularStudent(String name, int studentID, String course, double miscellaneousFee, double tuitionFee) {
        super(name, studentID, course);
        this.miscellaneousFee = miscellaneousFee;
        this.tuitionFee = tuitionFee;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    public double getMiscellaneousFee() {
        return miscellaneousFee;
    }

    public void setMiscellaneousFee(double miscellaneousFee) {
        this.miscellaneousFee = miscellaneousFee;
    }

    public double calculateFee() {
        return tuitionFee + miscellaneousFee;
    }
}
