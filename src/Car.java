import java.time.LocalDate;
import java.time.Period;

public class Car {
    private String brand;
    private LocalDate madeOfDay;
    private double price;
    private Body body;

    public Car(String brand, LocalDate madeOfDay, double price, Body body) {
        this.brand = brand;
        this.madeOfDay = madeOfDay;
        this.price = price;
        this.body = body;
    }

    public String bodyTypeIdentification(Body body) {
        switch (body) {
            case SUV, CROSSOVER -> {
                return "SUV car";
            }
            case SEDAN, HATCHBACK -> {
                return "Passenger car";
            }
            case STATION_WAGON, MINIVAN -> {
                return "Station Wagon car";
            }
        }
        return "";
    }

    public int determinationYearOfManufacture() {
        return Period.between(madeOfDay, LocalDate.now()).getYears();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LocalDate getMadeOfDay() {
        return madeOfDay;
    }

    public void setMadeOfDay(LocalDate madeOfDay) {
        this.madeOfDay = madeOfDay;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Car, " + "brand: " + brand + ", Made Of Day " + madeOfDay + ", Price " + price + "$, Years: " + determinationYearOfManufacture() + ", " + "Body: " + body;
    }
}
