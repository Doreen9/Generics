package universtitymodel4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BagOfLecturers1Test1 {
    Lecturer lecturer1 = new Lecturer("Benjamin Wiredu", 54, "Operating Systems");
    Lecturer lecturer2 = new Lecturer("Ferdinand Katsriku", 64, "Mathematics");
    Student student1 = new Student("Christiana Asare", 12234);
    Student student2 = new Student("Samuel Kwakye", 33234);

    BagOfLecturers1<Student> bag1 = new BagOfLecturers1<Student>();

    @Test
    List<Student> addLecturer() {
        List<Student> lecturerList = new ArrayList<>();
        lecturerList = bag1.addLecturer(lecturer1);
        lecturerList = bag1.addLecturer(lecturer2);
        lecturerList = bag1.addLecturer(student1);


        return lecturerList;



    }

    @Test
    void removeLecturer() {
        List<Student> lecturerList = addLecturer();
        List<Student> remove = bag1.removeLecturer(lecturer1);
        System.out.println(remove);
    }

    @Test
    void clearLecturers() {
    }
}