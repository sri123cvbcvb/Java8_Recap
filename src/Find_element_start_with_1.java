import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Find_element_start_with_1 {

    public static void main(String[] args) {
        int[] a = {1, 10, 2, 3, 45, 14};

        List<Integer> result = Arrays.stream(a)
                .boxed()
                .filter(i -> String.valueOf(i).startsWith("1"))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
