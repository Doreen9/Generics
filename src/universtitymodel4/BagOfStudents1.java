package universtitymodel4;

import java.util.ArrayList;
import java.util.List;

public class BagOfStudents1<Student> {


    List<Student> students = new ArrayList<>();

    public List<Student> addStudent(Student student){
        students.add(student);
        return  students;
    }
    public List<Student> removeStudent(Student student){
        students.remove(student);
        return students;
    }
    public List<Student> clearStudents(){
        for(Student student: students){
            students.remove(student);
        }
        return students;
    }


}
