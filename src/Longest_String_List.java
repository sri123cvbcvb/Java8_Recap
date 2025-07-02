import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Longest_String_List {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("java", "programming", "go");
        String longest = list.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println(longest);

    }
}
