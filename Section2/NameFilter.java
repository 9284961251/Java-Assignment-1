package Section2;
import java.util.ArrayList;

public class NameFilter {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Arya");
        names.add("Aryan");
        names.add("Atharav");
        names.add("Om");
        names.add("Sita");

        for (String name : names) {
            if (name.startsWith("S")) {
                System.out.println(name);
            }
        }
    }
}
