import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {

        List<Student> studentList = Stream.of(
                        new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122,
                                Arrays.asList("+912632632782", "+1673434729929")),
                        new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67,
                                Arrays.asList("+912632632762", "+1673434723929")),
                        new Student(3, "Ankit", 25, "Female", "Mechanical Engineering", "Kerala", 164,
                                Arrays.asList("+912632633882", "+1673434709929")),
                        new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26,
                                Arrays.asList("+9126325832782", "+1671434729929")),
                        new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12,
                                Arrays.asList("+012632632782")),
                        new Student(6, "Chetan", 24, "Male", "Mechanical Engineering", "Karnataka", 90,
                                Arrays.asList("+9126254632782", "+16736784729929")),
                        new Student(7, "Arun", 26, "Male", "Electronics Engineering", "Karnataka", 324,
                                Arrays.asList("+912632632782", "+1671234729929")),
                        new Student(8, "Nam", 31, "Male", "Computer Engineering", "Karnataka", 433,
                                Arrays.asList("+9126326355782", "+1673434729929")),
                        new Student(9, "Sonu", 27, "Female", "Computer Engineering", "Karnataka", 7,
                                Arrays.asList("+9126398932782", "+16563434729929", "+5673434729929")),
                        new Student(10, "Shubham", 26, "Male", "Instrumentation Engineering", "Mumbai",
                                98, Arrays.asList("+912632646482", "+16734323229929")))
                .collect(Collectors.toList());

        //Find the list of students whose rank is in between 50 and 100:

        List<Student> collect = studentList.stream()
                .filter(student -> student.getRank() >= 50 && student.getRank() <= 100)
                .collect(Collectors.toList());

        System.out.println(collect);

       //Find the Students who stays in Karnataka and sort them by their names:
        List<Student> karnatakaStd = studentList.stream()
                        .filter(std -> std.getCity()
                        .equalsIgnoreCase("Karnataka"))
                        .sorted()
                        .collect(Collectors.toList());
        System.out.println(karnatakaStd);

        //Find all departments names

        List<String> Dept = studentList.stream()
                .map(s -> s.getDept())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(Dept);

       // Find all the contact numbers:

        List<String> Contact = studentList.stream()
                .flatMap(s -> s.getContacts().stream())
                .collect(Collectors.toList());

        System.out.println(Contact);

        //Group The Student By Department Names:

        Map<String, List<Student>> collect1 = studentList.stream()
                .collect(Collectors.groupingBy(s -> s.getDept()));

        //Find the department who is having maximum number of students:

        String DeptWithMaxStd = studentList.stream()
                .collect(Collectors.groupingBy(s -> s.getDept(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println(DeptWithMaxStd);

        //Find the average age of male and female students:

        Map<String, Double> collect2 = studentList.stream()
                .collect(Collectors.groupingBy(s -> s.getGender(), Collectors.averagingInt(s -> s.getAge())));

        //Find the highest rank in each department:

        Map<String, Optional<Student>> collect3 = studentList.stream()
                .collect(Collectors.groupingBy(s -> s.getDept(), Collectors.maxBy(Comparator.comparingInt(s -> s.getRank()))));

        //Find the student who has second rank:

        Student student = studentList.stream()
                .sorted(Comparator.comparingInt(s -> s.getRank()))
                .skip(1)
                .findFirst()
                .get();

        System.out.println(student);

    }
    }
