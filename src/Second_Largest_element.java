import java.util.Arrays;
import java.util.Comparator;

public class Second_Largest_element {

    public static void main(String[] args) {
        int[] arr = {10, 30, 20, 40};
        int secondLargest = Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow();
        System.out.println(secondLargest);

    }
}
