import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Benjamin");
        arrayList.add("Abel");
        arrayList.remove("David");
        arrayList.add("Ezekiel");
        arrayList.add("Cain");
        Collections.sort(arrayList);
        System.out.println("ArrayList: " + arrayList);
    }
}
