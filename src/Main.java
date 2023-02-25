import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota Estima", LocalDate.of(2000, 5, 9), 8.200, Body.MINIVAN);
        Car car2 = new Car("Lexus 300", LocalDate.of(2022, 11, 4), 80.500, Body.SUV);
        Car car3 = new Car("Audi 100", LocalDate.of(1995, 7, 4), 4.400, Body.SEDAN);
        Car car4 = new Car("Gelande Wagen", LocalDate.of(2005, 8, 12), 18.300, Body.SUV);
        Car car5 = new Car("Honda Fit", LocalDate.of(2003, 5, 2), 6.700, Body.HATCHBACK);
        Car car6 = new Car("Wolkswagen", LocalDate.of(2000, 5, 9), 8.200, Body.STATION_WAGON);
        Car [] cars = {car1, car2, car3, car4, car5, car6};
        for (Car c : cars) {
            System.out.println(c);
        }

    }
}