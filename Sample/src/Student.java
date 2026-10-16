public class Student {
    private String name;
    private int studentID;
    private String course;

    public Student(String name, int studentID, String course) {
        this.name = name;
        this.studentID = studentID;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void displayInfo() {
        IO.println("Name: " + name);
        IO.println("Student ID: " + studentID);
        IO.println("Course Code: " + course);
    }
}
