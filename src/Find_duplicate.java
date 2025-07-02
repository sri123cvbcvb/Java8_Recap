import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Find_duplicate {

    public static void main(String[] args) {
        String str = "sriram";
        Set<Character> duplicates = str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        System.out.println(duplicates);

    }
}
