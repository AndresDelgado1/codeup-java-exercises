package practice;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("ford");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        System.out.println("Make= " + car.getMake());
        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.describeCar();
    }

}
