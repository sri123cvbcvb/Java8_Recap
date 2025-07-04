package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Book> Books = Arrays.asList(

                new Book("java", 300, 200),
                new Book("python", 150, 200),
                new Book("c++", 350, 500)
        );


        List<String> result = Books.stream()
                .filter(x -> x.getPage() < 200)
                .map(t -> t.getBookName().toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
