package data;

import challenges.StudentOps;
import domain.Student;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class StudentOpsTest {
        private static List<Student> students;

        @BeforeAll
        static void setUp() throws IOException {
            // Fetch data before all tests
            students = FetchData.getStudentList();
        }

        @Test
        void shouldReturnEmptyListWhenNoStudentsMatchGender() {
            List<Student> filteredStudents = StudentOps.filterStudentsByGender(students, "Other");
            assertThat(filteredStudents).isEmpty();
        }

        @Test
        void shouldReturnListStudentsMatchingGender() {
            List<Student> filteredStudents = StudentOps.filterStudentsByGender(students, "Female");
            assertEquals("Female",filteredStudents.get(5).getGender());
        }

        @Test
        void shouldCheckIfAllStudentsAreAdults(){
            assertFalse(StudentOps.allStudentsAdult(students));
        }

        @Test
        void shouldReturnOldestStudent(){
            Optional<Student> oldestStudent = StudentOps.findOldestStudent(students);
            assertEquals("Hazel", oldestStudent.map(Student::getFirst_name).orElse(null));
        }

        @Test
        void shouldReturnUppercaseFirstName(){
            List<String> studentsWithUppercaseName = StudentOps.firstNameToUppercase(students);
            assertEquals("KAITLYN", studentsWithUppercaseName.get(0));
        }

        @Test
        void shouldReturnStudentById(){
            Optional<Student> studentById = StudentOps.findById(students, 501);
            if(studentById.isPresent()) {
                assertEquals(1, studentById.get().getId());
            }else{
                assertFalse(studentById.isPresent());
            }
        }

        @Test
        void shouldReturnAgeCount(){
            Map<Integer, Long> countByAge = StudentOps.distributeByAge(students);
            assertEquals(2, countByAge.get(54));
        }

        @Test
        void shouldReturnGroupByAge(){
            Map<Integer, List<Student>> groupByAge = StudentOps.groupByAge(students);
            assertEquals(2, groupByAge.get(54).size());
        }


    }

