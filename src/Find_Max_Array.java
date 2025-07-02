import java.util.Arrays;
import java.util.OptionalInt;

public class Find_Max_Array {

    public static void main(String[] args) {
        int[] a = {1,2,4,5};

        OptionalInt max = Arrays.stream(a).max();

        System.out.println(max.getAsInt());
    }
}
