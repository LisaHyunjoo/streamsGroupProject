package challenges;

import domain.Student;

import java.time.LocalDate;
import java.util.List;

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
}
