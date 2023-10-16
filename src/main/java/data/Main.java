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
        List<Student> students = FetchData.getStudentList();
//        14.
        System.out.println("Are all students are adults? " + StudentOps.allStudentsAdult(students));

//        15.
        System.out.println("The oldest student is " + StudentOps.findOldestStudent(students));

//        16.
        System.out.println("Convert first name to Uppercase: " + StudentOps.firstNameToUppercase(students));
//
//        17.
        System.out.print("Please enter an id to find a student: ");
        Scanner sc = new Scanner(System.in);
        int targetId = sc.nextInt();
        if(targetId <= students.size()){
            System.out.println("The id " + targetId + " student is " + StudentOps.findById(students, targetId));
        }else {
            System.out.println("Student not found.");
        }

//        18.
        System.out.println("Students' count distributed by age: " + StudentOps.distributeByAge(students));

//        19.
        System.out.println("Students' group by age are: " + StudentOps.groupByAge(students));

//        20.
        System.out.println(StudentOps.deviationOfAge(students));

        List<Car> cars = FetchData.getCarList();
//        Scanner sc = new Scanner(System.in);
//      21.
        System.out.println("Please enter the car's make: ");
        String carMake = sc.nextLine();
        System.out.println("Car Lists sorted by " + carMake + ": "   + CarOps.carListByMake(cars, carMake));

//        22.
        System.out.println("Please enter a year of car: ");
        int year = sc.nextInt();
        System.out.println("Car Lists sorted by year " + year + ": " + CarOps.carListByYear(cars, year));

//        23.
        System.out.println("Please enter the minimum price: ");
        double min = sc.nextDouble();
        System.out.println("Please enter the maximum price: ");
        double max = sc.nextDouble();
        System.out.println("Car lists from  " + "$" + min + " to $" + max + " are " + CarOps.carListByPriceRange(cars, min, max));

//        24.
        System.out.println("Here are car lists: " + CarOps.carModelList(cars));

//        25.
        System.out.println(CarOps.carModelToUpperCase(cars));

//        26.
        System.out.println(CarOps.sortCarListByYear(cars));
    }
}
