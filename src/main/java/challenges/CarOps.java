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

}
