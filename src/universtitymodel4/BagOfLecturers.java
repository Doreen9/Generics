package universtitymodel4;

import java.util.ArrayList;
import java.util.List;

public class BagOfLecturers<Lecturer>{
    Lecturer lecturer;

    List<Lecturer> lecturers = new ArrayList<>();
    public BagOfLecturers(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
    public List<Lecturer> addLecturer(Lecturer student){
        lecturers.add(lecturer);
        return  lecturers;
    }
    public List<Lecturer> removeLecturer(Lecturer lecturer){
        lecturers.remove(lecturer);
        return lecturers;
    }
    public List<Lecturer> clearLecturers(){
        for(Lecturer lecturer: lecturers){
            lecturers.remove(lecturer);
        }
        return lecturers;
    }


}
