public class Car implements Comparable<Car> {
    private String model;
    private int year;

    public Car(int year, String model) {
        this.year = year;
        this.model = model;
    }


    @Override
    public int compareTo(Car car) {
        this.year
    }
}
