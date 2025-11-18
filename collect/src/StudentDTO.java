import javax.xml.namespace.QName;
import java.io.Serializable;

public class StudentDTO implements Serializable, Comparable<StudentDTO> {

    private  int id;
    private String name;
    private int marks;

    @Override
    public String toString() {
        return "StudentDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
    public StudentDTO( int id , String name , int  marks){
        this.id= id;
        this.name=name;
        this.marks=marks;
    }



    @Override
    public int compareTo(StudentDTO o) {
        return this.id-o.id;
    }

    public int getId() {
        return id;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }
}
