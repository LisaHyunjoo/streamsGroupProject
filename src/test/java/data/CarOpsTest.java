package data;

import challenges.CarOps;
import domain.Car;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarOpsTest {
    private static List<Car> cars;

    @BeforeAll
    static void setUp() throws IOException {
        cars = FetchData.getCarList();
    }

    @Test
    void shouldReturnCarListByMake(){
        List<Car> carsByMake = CarOps.carListByMake(cars, "BMW");
        assertEquals(5, carsByMake.get(0).getId());
    }

    @Test
    void shouldReturnCarListByYear(){
        List<Car> carsByYear = CarOps.carListByYear(cars, 1999);
        assertEquals(7, carsByYear.get(0).getId());
    }

    @Test
    void shouldReturnCarListByPriceRange(){
        List<Car> carsByPriceRange = CarOps.carListByPriceRange(cars, 70000.0, 75000.0);
        assertEquals(27, carsByPriceRange.get(0).getId());

    }
}
