package practice;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        System.out.println("Make= " + car.getMake());

        car.describeCar();

    }

}
