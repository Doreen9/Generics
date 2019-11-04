package universtitymodel4;

import java.util.ArrayList;
import java.util.List;

public class BagOfLecturers1<E> {

    List<E> objects = new ArrayList<>();


    public List<E> addLecturer(Object lecturer) {
        objects.add((E) lecturer);
        return objects;
    }

    public List<E> removeLecturer(Object lecturer) {
        objects.remove(lecturer);
        return objects;
    }

    public List<E> clearLecturers() {
        for (Object lecturer : objects) {
            objects.remove(lecturer);
        }
        return objects;
    }

}
