package Lambda_Expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Invoice> input = Arrays.asList(new Invoice("SRI", 500), new Invoice("RAM", 200));

        input.sort((a,b) -> Integer.compare(a.getAmount(), b.getAmount()));

        input.forEach(i -> System.out.println(i.getName()+" "+i.getAmount()));
    }
}
