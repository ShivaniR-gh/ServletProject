import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentCollection {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("shivani");
        list.add("sonu");
        list.add("saketh");
        list.add("sacchu");
        list.add("chintu");
        list.add("Kuchita");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
