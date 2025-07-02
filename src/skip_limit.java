import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class skip_limit {

    public static void main(String[] args) {
        List<Integer> result = Arrays.asList(1, 2, 3, 4, 5, 6, 7).stream()
                .skip(2)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(result);

    }
}
