package challenges;

import domain.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


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

// 23.  Filter by Price: Filter the list of cars to only include cars within a price range.
    public static List<Car> carListByPriceRange(List<Car> cars, Double minPrice, Double maxPrice){
        return cars.stream()
                .filter(c -> c.getPrice() >= minPrice && c.getPrice() <= maxPrice)
                .toList();
    }

//  24.  Map to Model Names: Create a list of car model names from the list of cars.
    public static List<String> carModelList(List<Car> cars){
        return cars.stream()
                .map(Car::getModel)
                .toList();
    }

//  25.  Map to Upper Case Makes: Create a list of car makes in uppercase from the list of cars.
    public static List<String> carModelToUpperCase(List<Car> cars){
        return cars.stream()
                .map(c->c.getModel().toUpperCase())
                .toList();
    }

//  26.  Sort by Year: Sort the list of cars based on the year in ascending order.
    public static List<Car> sortCarListByYear(List<Car> cars){
        return cars.stream()
                .sorted(Comparator.comparingInt(Car::getYear))
                .toList();
    }
}
