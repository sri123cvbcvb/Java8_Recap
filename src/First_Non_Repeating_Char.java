public class First_Non_Repeating_Char {

    public static void main(String[] args) {
        String str = "swiss";
        Character result = str.chars()
                .mapToObj(c -> (char)c)
                .filter(c -> str.indexOf(c) == str.lastIndexOf(c))
                .findFirst()
                .orElse(null);
        System.out.println(result);

    }
}
