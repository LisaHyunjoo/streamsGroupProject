package challenges;

import domain.Car;

import java.util.ArrayList;
import java.util.List;


public class CarOps {

//    21. Filter by Make: Filter the list of cars to only include cars with a specific make.
    public static List<Car> carListByMake(List<Car> cars, String make){
        return cars.stream()
                .filter(s -> s.getMake().equalsIgnoreCase(make))
                .toList();
    }

//  22. Filter by Year: Filter the list of cars to only include cars from a specific year.
    public static List<Car> carListByYear(List<Car> cars, Integer targetYear){
        return cars.stream()
                .filter(s-> s.getYear().equals(targetYear))
                .toList();
    }

}
