import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Car implements Comparable<Car> {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {echo "# PGO-project-07" >> README.md
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Car otherCar) {
        return Integer.compare(this.year, otherCar.year);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 2010));
        cars.add(new Car("Honda", 2012));
        cars.add(new Car("Ford", 2015));

        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
