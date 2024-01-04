
import org.junit.jupiter.api.Test;
import seminars.second.hw.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class VehicleTest {
    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Mercedes", "glc", 2020);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testMotorcycleIsInstanceOfVehicle() {
        Motorcycle motorcycle = new Motorcycle("Baltmotors", "AVA", 2022);
        assertTrue(motorcycle instanceof Vehicle);
    }

    @Test
    public void testCarFourWheels() {
        Car car = new Car("Mercedes", "glc", 2020);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    public void testMotorcycleTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Baltmotors", "AVA", 2022);
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    public void testCarSpeed() {
        Car car = new Car("Mercedes", "glc", 2020);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    public void testMotorcycleSpeed() {
        Motorcycle motorcycle = new Motorcycle("Baltmotors", "AVA", 2022);
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    public void testCarPark() {
        Car car = new Car("Mercedes", "glc", 2020);
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    public void testMotorcyclePark() {
        Motorcycle motorcycle = new Motorcycle("Baltmotors", "AVA", 2022);
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}