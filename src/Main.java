import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Abel");
        arrayList.add("Benjamin");
        arrayList.remove("Cain");
        arrayList.add("David");
        arrayList.add("Ezekiel");

        System.out.println("ArrayList: " + arrayList);
    }
}
