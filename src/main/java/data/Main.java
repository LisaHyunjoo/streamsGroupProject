package data;

import challenges.StudentOps;
import domain.Student;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        FetchData.getCarList().stream()
//                .limit(5)
//                .forEach(System.out::println);
//        System.out.println("++++++++++++++++");
//        FetchData.getStudentList().stream()
//                .limit(5)
//                .forEach(System.out::println);
        List<Student> students = FetchData.getStudentList();
        System.out.println("Are all students are adults? " + StudentOps.allStudentsAdult(students));
        System.out.println("The oldest student is " + StudentOps.findOldestStudent(students));
        System.out.println("Convert first name to Uppercase: " + StudentOps.firstNameToUppercase(students));

//        System.out.print("Please enter an id to find a student: ");
//        Scanner sc = new Scanner(System.in);
//        int targetId = sc.nextInt();
//        if(targetId <= students.size()){
//            System.out.println("The id " + targetId + " student is " + StudentOps.findById(students, targetId));
//        }else {
//            System.out.println("Student not found.");
//        }

        System.out.println(StudentOps.distributeByAge(students));

    }

}
