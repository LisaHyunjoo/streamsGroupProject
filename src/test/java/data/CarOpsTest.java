package data;

import challenges.CarOps;
import domain.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class CarOpsTest {
    private static List<Car> cars;

    @BeforeAll
    static void setUp() throws IOException {
        cars = FetchData.getCarList();
    }

    @Test
    void shouldReturnCarListByMake(){
        List<Car> carsByMake = CarOps.carListByMake(cars, "BMW");
        Assertions.assertEquals(5, carsByMake.get(0).getId());

    }
}
