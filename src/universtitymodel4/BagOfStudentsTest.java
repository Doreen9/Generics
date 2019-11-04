package universtitymodel4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BagOfStudentsTest {
    Student student1 = new Student("Christiana Asare", 12234);
    Student student2 = new Student("Samuel Kwakye", 33234);
    Lecturer lecturer2 = new Lecturer("Ferdinand Katsriku", 64, "Mathematics");

    BagOfStudents bag1 = new BagOfStudents();
    @Test
    List<Student> addStudent() {
            List<Student> studentList = new ArrayList<>();
             studentList = bag1.addStudent(student1);
             studentList = bag1.addStudent(student2);
             return studentList;

    }

    @Test
    void removeStudent() {
        List<Student> studentList = addStudent();
        List<Student> remove = bag1.removeStudent(student1);
        System.out.println(remove);
    }

    @Test
    void clearStudents() {
    }
}