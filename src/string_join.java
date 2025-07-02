import java.util.Arrays;
import java.util.List;

public class string_join {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "Go");
        String joined = String.join(", ", list);
        System.out.println(joined);

    }
}
