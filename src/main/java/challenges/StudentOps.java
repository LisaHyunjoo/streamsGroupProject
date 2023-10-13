package challenges;

import domain.Student;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
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
}
