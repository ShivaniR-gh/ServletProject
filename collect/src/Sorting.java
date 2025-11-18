import java.util.Comparator;

public class Sorting implements Comparator<StudentDTO> {

    @Override

    public int compare(StudentDTO o1, StudentDTO o2) {
        return o1.getId() - o2.getId();
    }
    public int compare(StudentDTO o1, StudentDTO o2) {
        return o1.name.compare(s2.name);
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
