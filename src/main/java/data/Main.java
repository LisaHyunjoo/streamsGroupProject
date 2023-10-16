package data;

import challenges.CarOps;
import challenges.StudentOps;
import domain.Car;
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
//        List<Student> students = FetchData.getStudentList();
////        14.
//        System.out.println("Are all students are adults? " + StudentOps.allStudentsAdult(students));
//
////        15.
//        System.out.println("The oldest student is " + StudentOps.findOldestStudent(students));
//
////        16.
//        System.out.println("Convert first name to Uppercase: " + StudentOps.firstNameToUppercase(students));
////
////        17.
//        System.out.print("Please enter an id to find a student: ");
//        Scanner sc = new Scanner(System.in);
//        int targetId = sc.nextInt();
//        if(targetId <= students.size()){
//            System.out.println("The id " + targetId + " student is " + StudentOps.findById(students, targetId));
//        }else {
//            System.out.println("Student not found.");
//        }
//
////        18.
//        System.out.println("Students' count distributed by age: " + StudentOps.distributeByAge(students));
//
////        19.
//        System.out.println("Students' group by age are: " + StudentOps.groupByAge(students));
//
////        20.
//        System.out.println(StudentOps.deviationOfAge(students));

        List<Car> cars = FetchData.getCarList();
//21.
        System.out.println("Please enter the car's make: ");
        Scanner sc = new Scanner(System.in);
        String carMake = sc.nextLine();
        System.out.println("Car Lists sorted by " + carMake  + CarOps.carListByMake(cars, carMake));
    }

}
