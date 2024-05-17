public class Main {
    public static void main(String[] args) {
        // Creating instances of different car models
        HondaJazz jazz = new HondaJazz();
        ToyotaFortuner fortuner = new ToyotaFortuner();
        SuzukiKatana katana = new SuzukiKatana();

        // Demonstrating polymorphism and method overriding
        Car[] cars = {jazz, fortuner, katana};

        for (Car car : cars) {
            car.moveForward();
            car.turn();
            System.out.println("Fuel Capacity: " + car.getFuelCapacity());
            System.out.println("Transmission: " + car.getTransmissionType());
            System.out.println();
        }

        // Specific methods for each car model
        jazz.playMusic();
        fortuner.engage4WD();
        katana.openRoof();
    }
}
