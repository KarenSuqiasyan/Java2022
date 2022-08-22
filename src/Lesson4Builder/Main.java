package Lesson4Builder;

public class Main {
    public static void main(String[] args) {

        Car am1 = new Car.Builder()
                .setMark("audi")
                .setYear(1999)
                .build();
    }
}
