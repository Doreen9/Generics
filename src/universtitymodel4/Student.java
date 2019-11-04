package universtitymodel4;

public class Student {
    private String studentName;
    private Integer studentId;

    public Student(String studentName, Integer studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student's name: " + studentName + "\n" +
                "Student's age: " + studentId + "\n";

    }
}
