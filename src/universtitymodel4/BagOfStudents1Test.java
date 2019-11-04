package universtitymodel4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BagOfStudents1Test {
    Lecturer lecturer1 = new Lecturer("Benjamin Wiredu", 54, "Operating Systems");
    Lecturer lecturer2 = new Lecturer("Ferdinand Katsriku", 64, "Mathematics");
    Lecturer lecturer3 = new Lecturer("John Mensah", 34, "Integrated Science");
    Lecturer lecturer4 = new Lecturer("George Ampah", 24, "Physics");
    Lecturer lecturer5 = new Lecturer("Michael Gyan", 45, "English");

    BagOfStudents1<Lecturer> bag1 = new BagOfStudents1<Lecturer>();

    @Test
    List<Lecturer> addStudent() {
        List<Lecturer> lecturerList = new ArrayList<>();
        lecturerList = bag1.addStudent(lecturer1);
        lecturerList = bag1.addStudent(lecturer2);
        lecturerList = bag1.addStudent(lecturer3);
        lecturerList = bag1.addStudent(lecturer4);
        lecturerList = bag1.addStudent(lecturer5);

        return lecturerList;

    }

    @Test
    void removeStudent() {
        List<Lecturer> lecturerList = addStudent();
        List<Lecturer> remove = bag1.removeStudent(lecturer1);
        System.out.println(remove);
    }

    @Test
    void clearStudents() {
    }
}