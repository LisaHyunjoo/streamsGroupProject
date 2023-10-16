package challenges;

import domain.Student;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentOps {
    public static List<Student> filterStudentsByGender(List<Student> students, String gender) {
        return students.stream()
                .filter(student -> student.getGender().equalsIgnoreCase(gender))
                .toList();
    }

    //   14. Check if All Students are Adults: Check if all students are adults (age 18 or older).
    public static boolean allStudentsAdult(List<Student> students){
        LocalDate today = LocalDate.now();
        return students.stream()
                .allMatch(s -> s.getDob().plusYears(18).isBefore(today));
    }

    //   15. Find Oldest Student: Find the oldest student.
    public static Optional<Student> findOldestStudent(List<Student> students){
        return students.stream()
                .max((s1, s2) -> s1.getDob().compareTo(s2.getDob()));
    }

//   16. Convert to Uppercase: Convert all student first names to uppercase.
    public static List<String> firstNameToUppercase(List<Student> students){
        return students.stream()
                .map(s -> s.getFirst_name().toUpperCase())
                .toList();
    }

//   17. Find Student by ID: Find a student by their ID.
    public static Optional<Student> findById(List<Student> students, Integer targetId){
        return students.stream()
                .filter(s -> s.getId().equals(targetId))
                .findFirst();
    }

//   18. Compute Age Distribution: Compute the distribution of ages (e.g., count of students for each age).
    public static Map<Integer, Long> distributeByAge(List<Student> students){
        return students.stream()
                .map(s-> Period.between(s.getDob(), LocalDate.now()).getYears())
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }

//   19. Group Students by Age: Group the students by their age.
    public static Map<Integer,List<Student>> groupByAge(List<Student> students){
        return students.stream()
                .collect(Collectors.groupingBy(s -> {
                    LocalDate currentDate = LocalDate.now();
                    Period period = Period.between(s.getDob(), currentDate);
                    return period.getYears();
                }));
    }

//  20. Calculate Age Standard Deviation: Calculate the standard deviation of ages for all students.
    private static int calcuateAge(LocalDate dob){
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(dob, currentDate);
        int age = period.getYears();
        return age;
    }
    public static Double deviationOfAge(List<Student> students){
        double averageAge = students.stream()
                .mapToDouble(s -> calcuateAge(s.getDob()))
                .average()
                .orElse(0.0);

        double sumOfSquares = students.stream()
                .mapToDouble(s -> Math.pow(calcuateAge(s.getDob())- averageAge, 2))
                .sum();

        double variance = sumOfSquares/(students.size());

        return (double) Math.round(Math.sqrt(variance));

        }
}
