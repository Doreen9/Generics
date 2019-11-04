package universtitymodel4;

public class Lecturer {
    public String lecturerName;
    public Integer lecturerAge;
    public String Subject;

    public Lecturer(String lecturerName, Integer lecturerAge, String subject) {
        this.lecturerAge = lecturerAge;
        this.Subject = subject;
        this.lecturerName = lecturerName;
    }

    @Override
    public String toString() {
        return "Lecturer's name: " + lecturerName + "\n" +
                "Lecturer's age: " + lecturerAge + "\n" +
                "Lecturer's Subject: " + Subject + "\n";
    }
}
