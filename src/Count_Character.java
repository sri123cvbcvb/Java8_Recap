import java.util.Map;
import java.util.stream.Collectors;

public class Count_Character {

    public static void main(String[] args) {
        String str = "sriram";

        Map<Character, Long> CharCount = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));


        System.out.println(CharCount);

    }
}
